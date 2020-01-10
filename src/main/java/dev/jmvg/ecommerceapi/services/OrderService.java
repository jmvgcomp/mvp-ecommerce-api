package dev.jmvg.ecommerceapi.services;

import dev.jmvg.ecommerceapi.entities.Order;
import dev.jmvg.ecommerceapi.repositories.OrderRepository;
import jdk.nashorn.internal.runtime.options.Option;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    private OrderRepository repository;

    @Autowired
    public OrderService(OrderRepository repository) {
        this.repository = repository;
    }

    public List<Order> findAll(){
        return repository.findAll();
    }

    public Order findById(Long id){
        Optional<Order> order = repository.findById(id);
        return order.get();
    }

}
