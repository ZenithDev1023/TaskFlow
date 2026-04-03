package com.example.TaskFlow.dto.request;

import com.example.TaskFlow.entity.User;
import com.example.TaskFlow.entity.Category;

import com.example.TaskFlow.enums.task.TaskStatus;
import com.example.TaskFlow.enums.task.TaskPriority;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;


public class TaskRequest {

    @NotBlank(message = "Please enter the title!")
    private String title;

    @NotBlank(message = "Please enter the description!")
    private String description;

    @NotNull(message = "Please set the status!")
    private TaskStatus status;

    @NotNull(message = "Please set the priority!")
    private TaskPriority priority;

    @NotNull(message = "Please set the due date!")
    private LocalDateTime dueDate;

    @NotNull(message = "Please enter the User!")
    public User user;

    @NotNull(message = "Please enter the Category!")
    private Category category;


    // Getters
    public String getTitle() { return title; }
    public String getDescription() { return description; }
    public TaskStatus getTaskStatus() { return status; }
    public TaskPriority getTaskPriority() { return priority; }
    public LocalDateTime getDueDate() { return dueDate; }
    public User getUser() { return user; }
    public Category getCategory() { return category; }


    // Setters
    public void setTitle(String title) { this.title = title; }
    public void setDescription(String description) { this.description = description; }
    public void setTaskStatus(TaskStatus status) { this.status = status; }
    public void setTaskPriority(TaskPriority priority) { this.priority = priority; }
    public void setDueDate(LocalDateTime dueDate) { this.dueDate = dueDate; }
    public void setUser(User user) { this.user = user; }
    public void setCategory(Category category) { this.category = category; } 


}
