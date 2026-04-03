package com.example.TaskFlow.entity;

import lombok.Setter;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

import com.example.TaskFlow.enums.user.UserRole;

@Entity
@Table(name = "users")
@Getter
@Setter
@RequiredArgsConstructor
public class User {

    // Fields
    @Id
    private Long id;
    private String username;
    private String email;
    private String password;
    private UserRole role;
    
    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;


    public String toString() {
        return String.format(
            "ID: %d, Username: %s, Email: %s, Password: %s, Role: %s, Created-At: %s, Updated-At: %s",
            id, username, email, password, role, createdAt, updatedAt
        );
    }
    
}
