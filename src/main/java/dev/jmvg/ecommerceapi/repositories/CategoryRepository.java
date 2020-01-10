package dev.jmvg.ecommerceapi.repositories;

import dev.jmvg.ecommerceapi.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
