package com.example.TaskFlow.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.TaskFlow.entity.Category;
import com.example.TaskFlow.entity.User;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
    
    void deleteById(Long id);
    void deleteByUser(User user);

    public List<Category> findAll();

    public List<Category> findByName(String name);
    public Optional<Category> findByUser(User user);
}
