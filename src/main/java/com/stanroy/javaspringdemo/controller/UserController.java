package com.stanroy.javaspringdemo.controller;

import com.stanroy.javaspringdemo.repository.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {

    private UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/")
    void findAll() {
        userRepository.findAll();
    }


    @GetMapping("/{login}")
    void findOne(@PathVariable String login) {
        userRepository.findByLogin(login);
    }
}
