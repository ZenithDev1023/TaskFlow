package com.example.TaskFlow.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.TaskFlow.repository.UserRepository;

import jakarta.transaction.Transactional;

import com.example.TaskFlow.config.SecurityConfig;

import com.example.TaskFlow.entity.User;


@Service
public class UserService {

    private UserRepository userRepository;
    private SecurityConfig securityConfig;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Transactional
    public User registerUser(User user) {
        userRepository.save(user);
        return user;
    }    
}
