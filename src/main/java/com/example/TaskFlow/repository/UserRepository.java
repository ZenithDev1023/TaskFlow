package com.example.TaskFlow.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.TaskFlow.service.UserService;

import com.example.TaskFlow.entity.User;
import com.example.TaskFlow.enums.user.UserRole;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    void deleteById(Long id);
    void deleteByUsername(String username);
    void deleteByEmail(String email);

    Optional<User> findById(Long id);
    Optional<User> findByEmail(String email);
    Optional<User> findByUsername(String username);

    List<User> findByRole(UserRole role);
}
