package com.example.TaskFlow.entity;

import lombok.Setter;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

import com.example.TaskFlow.enums.task.*;


@Entity 
@Table(name = "tasks")
@Getter
@Setter
@RequiredArgsConstructor
public class Task {

    // Fields
    @Id 
    private Long id;

    private String title;
    private String description;
    private TaskStatus status;
    private TaskPriority priority;

    @Column(name = "due_date")
    private LocalDateTime dueDate;

    private User user;
    private Category category;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;



    public String toString() {
        return String.format(
            "ID: %d, Title: %S, Description: %s, Status: %s, Priority: %s, Due_Date: %s, User: %s, Category: %s, Created_At: %s, Updated_At: %s",
            id, title, description, status, priority, dueDate, user, category, createdAt, updatedAt
        );
    }




    
}
