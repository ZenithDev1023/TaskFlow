package com.example.TaskFlow.enums.user;

public enum UserRole {
    USER("User"),
    ADMIN("Admin");

    private final String role;

    UserRole(String role) {
        this.role = role;
    }

    public String getRole() { return role; }    
}


