package dev.jmvg.ecommerceapi.config;

import dev.jmvg.ecommerceapi.entities.User;
import dev.jmvg.ecommerceapi.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    private UserRepository userRepository;

    @Autowired
    public TestConfig(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public void run(String... args) throws Exception {
        User user1 = new User(null, "Maria", "maria@gmail.com", "31231231", "12345");
        User user2 = new User(null, "Brown", "brown@gmail.com", "7515231", "54321");

        userRepository.saveAll(Arrays.asList(user1, user2));
    }
}
