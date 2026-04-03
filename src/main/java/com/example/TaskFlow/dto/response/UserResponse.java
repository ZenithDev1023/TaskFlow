package com.example.TaskFlow.dto.response;

import lombok.Builder;
import lombok.Data;

import com.example.TaskFlow.enums.user.UserRole;

@Data
@Builder
public class UserResponse {

    // Fields
    private String username;
    private String email;
    private UserRole role;  

    // Constructor
    public UserResponse(
        String username,
        String email,
        UserRole role
    ) {
        this.username = username;
        this.email = email;
        this.role = role;
    }

    // Getters
    public String getUsername() { return username; }
    public String getEmail() { return email; }
    public UserRole getUserRole() { return role; }
}
