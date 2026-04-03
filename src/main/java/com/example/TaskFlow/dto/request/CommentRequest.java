package com.example.TaskFlow.dto.request;

import com.example.TaskFlow.entity.User;
import com.example.TaskFlow.entity.Task;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;


public class CommentRequest {

    @NotBlank(message = "Text cannot be empty!")
    private String text;

    @NotNull(message = "Please enter the User!")
    private User user;

    @NotNull(message = "Please enter the Task!")
    private Task task;

    // Getters
    public String getText() { return text; }
    public User getUser() { return user; }
    public Task getTask() { return task; }

    // Setters
    public void setText(String text) { this.text = text; }
    public void setUser(User user) { this.user = user; }
    public void setTask(Task task) { this.task = task; }
}
