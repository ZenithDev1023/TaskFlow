package com.example.TaskFlow.dto.response;

import java.time.LocalDateTime;

import com.example.TaskFlow.enums.task.TaskPriority;
import com.example.TaskFlow.enums.task.TaskStatus;

import com.example.TaskFlow.entity.User;
import com.example.TaskFlow.entity.Category;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TaskResponse {

    // Fields
    private String title;
    private String message;   
    private LocalDateTime dueDate;
    public TaskStatus status;
    private TaskPriority priority;
    private User user;
    private Category category;

    // Constructor
    public TaskResponse(
        String title,
        String message,
        LocalDateTime dueDate,
        TaskStatus status,
        TaskPriority priority,
        User user,
        Category category
    ) {
        this.title = title;
        this.message = message;
        this.dueDate = dueDate;
        this.status = status;
        this.priority = priority;
        this.user = user;
        this.category = category;
    }

    // Getters
    public String getTitle() { return title; }
    public String getMessage() { return message; }
    public LocalDateTime getDueDate() { return dueDate; }
    public TaskStatus getTaskStatus() { return status; }
    public TaskPriority getTaskPriority() { return priority; }
    public User getUser() { return user; }
    public Category getCategory() { return category; }
}
