package dev.jmvg.ecommerceapi.services;

import dev.jmvg.ecommerceapi.entities.User;
import dev.jmvg.ecommerceapi.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public List<User> findAll(){
        return repository.findAll();
    }

    public User findByID(Long id){
        Optional<User> obj = repository.findById(id);
        return obj.get();
    }

}
