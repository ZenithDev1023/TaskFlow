package com.example.TaskFlow.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.TaskFlow.repository.CategoryRepository;


import java.util.List;

import com.example.TaskFlow.entity.Category;

@Service
public class CategoryService {

    private CategoryRepository categoryRepository;

    @Autowired
    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }


    @Transactional(readOnly = true)
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }


    @Transactional
    public Category addCategory(Category category) {
        categoryRepository.save(category);
        return category;
    }
    
}
