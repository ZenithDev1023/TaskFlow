package com.example.TaskFlow.dto.request;

import jakarta.validation.constraints.NotBlank;

import lombok.Builder;
import lombok.Data;

import com.example.TaskFlow.enums.user.UserRole;

@Data
@Builder
public class RegisterRequest {
    @NotBlank(message = "Username is mandatory")
    private String username;

    @NotBlank(message = "Email is mandatory")
    private String email; 

    @NotBlank(message = "Password is mandatory")
    private String password;

    @NotBlank(message = "User Role is mandatory")
    private UserRole role;


    // Getters
    public String getUsername() { return username; }
    public String getEmail() { return email; }
    public String getPassword() { return password; }
    public UserRole getUserRole() { return role; }

    // Setters
    public void setUsername(String username) { this.username = username; }
    public void setEmail(String email) { this.email = email; }
    public void setPassword(String password) { this.password = password; }
    public void setUserRole(UserRole role) { this.role = role; }
}
