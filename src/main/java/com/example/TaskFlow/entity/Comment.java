package com.example.TaskFlow.entity;

import lombok.Setter;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String text;

    @ManyToOne 
    @JoinColumn(name = "task_id", nullable = false)
    private Task task;

    @ManyToOne 
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
    
    @Column(nullable = false)
    private LocalDateTime createdAt;


    public String toString() { return String.format(
        "ID: %d, Text: %s, Task: %s, User: %s",
        id, text, task, user
    );
}
    
}
