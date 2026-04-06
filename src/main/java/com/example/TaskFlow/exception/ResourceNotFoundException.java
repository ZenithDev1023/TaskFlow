package com.example.TaskFlow.exception;

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String text) {
        super(text);
    }

    public ResourceNotFoundException(String text, Throwable cause) {
        super(text, cause);
    }
}
