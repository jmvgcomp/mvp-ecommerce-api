package dev.jmvg.ecommerceapi.config;

import dev.jmvg.ecommerceapi.entities.Order;
import dev.jmvg.ecommerceapi.entities.User;
import dev.jmvg.ecommerceapi.repositories.OrderRepository;
import dev.jmvg.ecommerceapi.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    private UserRepository userRepository;
    private OrderRepository orderRepository;

    @Autowired
    public TestConfig(UserRepository userRepository, OrderRepository orderRepository) {
        this.userRepository = userRepository;
        this.orderRepository = orderRepository;
    }




    @Override
    public void run(String... args) throws Exception {
        User user1 = new User(null, "Maria", "maria@gmail.com", "31231231", "12345");
        User user2 = new User(null, "Brown", "brown@gmail.com", "7515231", "54321");

        Order order1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), user1);
        Order order2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), user2);
        Order order3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), user1);

        userRepository.saveAll(Arrays.asList(user1, user2));
        orderRepository.saveAll(Arrays.asList(order1,order2, order3));
    }
}
