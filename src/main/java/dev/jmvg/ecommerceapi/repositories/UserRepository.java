package dev.jmvg.ecommerceapi.repositories;

import dev.jmvg.ecommerceapi.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
