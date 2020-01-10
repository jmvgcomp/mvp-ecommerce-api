package dev.jmvg.ecommerceapi.repositories;

import dev.jmvg.ecommerceapi.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
