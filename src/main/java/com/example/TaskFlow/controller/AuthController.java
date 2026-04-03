package com.example.TaskFlow.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.TaskFlow.service.AuthService;
import com.example.TaskFlow.service.UserService;
import com.example.TaskFlow.entity.User;

import com.example.TaskFlow.config.SecurityConfig;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private UserService userService;
    private AuthService authService;

    @Autowired
    public AuthController(UserService userService, AuthService authService) {
        this.userService = userService;
        this.authService = authService;
    }


    @PostMapping("/register")
    public ResponseEntity<User> addUser(@Valid @RequestBody User user) {
        User u = userService.registerUser(user);

        if (u != null) {
            return new ResponseEntity<>(u, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(u, HttpStatus.NOT_FOUND);
        }
    }


    @PostMapping("/login")
    public List<User> loginUser(@Valid @RequestBody User user) {
        return authService.login(user);
    }

    @PostMapping("/logout")
    public List<User> logoutUser(@Valid @RequestBody User user) {
        return authService.logout(user);
    }   
}
