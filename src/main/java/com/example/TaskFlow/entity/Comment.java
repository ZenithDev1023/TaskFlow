package com.example.TaskFlow.entity;

import lombok.Setter;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;

import java.time.LocalDateTime;



@Entity
@Table(name = "comments")
@Getter
@Setter
@RequiredArgsConstructor
public class Comment {

    // Fields 
    @Id
    private Long id;

    private String text;
    private Task task;
    private User user;
    
    @Column(name = "created_at")
    private LocalDateTime createdAt;


    public String toString() { return String.format(
        "ID: %d, Text: %s, Task: %s, User: %s",
        id, text, task, user
    );
}
    
}
