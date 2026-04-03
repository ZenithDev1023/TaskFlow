package com.example.TaskFlow.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.TaskFlow.entity.User;
import com.example.TaskFlow.repository.AuthRepository;

import java.util.List;

@Service
public class AuthService {
    
    private AuthRepository authRepository;

    @Autowired
    public AuthService(AuthRepository authRepository) {
        this.authRepository = authRepository;
    }

    @Transactional
    public List<User> login(User user) {
        return authRepository.loginUser(user);
    }

    @Transactional
    public List<User> logout(User user) {
        return authRepository.logoutUser(user);
    }
}
