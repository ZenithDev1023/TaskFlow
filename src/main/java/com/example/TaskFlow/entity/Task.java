package com.example.TaskFlow.entity;

import lombok.Setter;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
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
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String description;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TaskStatus status;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TaskPriority priority;

    @Column(name = "due_date", nullable = false)
    private LocalDateTime dueDate;

    @ManyToOne 
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "categories_id", nullable = false)
    private Category category;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    @Column(name = "updated_at", nullable = false)
    private LocalDateTime updatedAt;


    public String toString() {
        return String.format(
            "ID: %d, Title: %S, Description: %s, Status: %s, Priority: %s, Due_Date: %s, User: %s, Category: %s, Created_At: %s, Updated_At: %s",
            id, title, description, status, priority, dueDate, user, category, createdAt, updatedAt
        );
    }




    
}
