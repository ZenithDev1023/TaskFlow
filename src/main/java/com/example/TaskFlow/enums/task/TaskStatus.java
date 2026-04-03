package com.example.TaskFlow.enums.task;

public enum TaskStatus {

    PENDING("Pending"),
    IN_PROGRESS("IN_PROGRESS"),
    COMPLETED("Completed");

    private String status;

    TaskStatus(String status) {
        this.status = status;
    }

    public String getStatus() { return status; }
}
