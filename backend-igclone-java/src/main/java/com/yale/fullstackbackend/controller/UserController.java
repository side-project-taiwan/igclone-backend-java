package com.yale.fullstackbackend.controller;
import com.yale.fullstackbackend.model.User;
import com.yale.fullstackbackend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/user")
    User newUser(@RequestBody User newUser){
        return userRepository.save(newUser);
    }

    @GetMapping("/test")
    public String printTest(){
        System.out.println("test api");
        return "test api";
    }

    @GetMapping("/user")
    List<User> getAllUser(){
        return userRepository.findAll();
    }

    @DeleteMapping("/user/{id}")
    void deleteUser(@PathVariable Long id) {
        if (userRepository.existsById(id)) {
            userRepository.deleteById(id);
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "User not found with id " + id);
        }
    }

}
