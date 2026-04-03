package com.example.TaskFlow.repository;

import java.util.Optional;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.TaskFlow.entity.User;

@Repository
public interface AuthRepository extends JpaRepository<User, Long> {
    
    public Optional<User> findCurrentUser(User user);

    public List<User> loginUser(User user);
    public List<User> logoutUser(User user);
}
