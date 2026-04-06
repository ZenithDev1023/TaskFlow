package com.example.TaskFlow.exception;

public class GlobalExceptionHandler extends RuntimeException {
    public GlobalExceptionHandler(String text) {
        super(text);
    }

    public GlobalExceptionHandler(String text, Throwable cause) {
        super(text, cause);
    }
}
