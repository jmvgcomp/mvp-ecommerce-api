package dev.jmvg.ecommerceapi.resources;

import dev.jmvg.ecommerceapi.entities.Order;
import dev.jmvg.ecommerceapi.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/orders")
public class OrderResource {

    private OrderService service;
    @Autowired
    public OrderResource(OrderService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<Order>> findAll(){
        List<Order> orders = service.findAll();
        return ResponseEntity.ok().body(orders);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Order> findById(@PathVariable Long id){
        Order order = service.findById(id);
        return ResponseEntity.ok().body(order);
    }

}
