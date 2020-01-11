package dev.jmvg.ecommerceapi.repositories;

import dev.jmvg.ecommerceapi.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
