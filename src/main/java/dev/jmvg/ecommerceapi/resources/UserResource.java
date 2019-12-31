package dev.jmvg.ecommerceapi.resources;

import dev.jmvg.ecommerceapi.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll(){
         User u = new User(1L, "maria", "maria@maria.com", "9219321", "192319");
         return ResponseEntity.ok().body(u);
    }

}
