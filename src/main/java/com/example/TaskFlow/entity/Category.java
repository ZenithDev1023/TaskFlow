package com.example.TaskFlow.entity;

import lombok.Setter;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Column;


@Entity 
@Table(name = "categories")
@Getter
@Setter
@RequiredArgsConstructor
public class Category {

    // Fields
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String description;

    @ManyToOne 
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;


    public String toString() {
        return String.format(
            "ID: %d, Name: %s, Description: %s, User: %s, Created_At: %s",
            id, name, description, user, createdAt
        );
    }
    
}
