package dev.jmvg.ecommerceapi.repositories;

import dev.jmvg.ecommerceapi.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
