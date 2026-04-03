package com.example.TaskFlow.entity;

import lombok.Setter;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.Column;


@Entity 
@Table(name = "categories")
@Getter
@Setter
@RequiredArgsConstructor
public class Category {

    // Fields
    @Id
    private Long id;

    private String name;
    private String description;
    private User user;

    @Column(name = "created_at")
    private LocalDateTime createdAt;


    public String toString() {
        return String.format(
            "ID: %d, Name: %s, Description: %s, User: %s, Created_At: %s",
            id, name, description, user, createdAt
        );
    }
    
}
