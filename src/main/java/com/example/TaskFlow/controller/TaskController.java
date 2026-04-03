package com.example.TaskFlow.controller;

import java.util.List;
import java.util.Optional;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.TaskFlow.service.TaskService;
import com.example.TaskFlow.entity.User;
import com.example.TaskFlow.enums.task.TaskPriority;
import com.example.TaskFlow.entity.Task;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    private TaskService taskService;

    @Autowired
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }


    @GetMapping
    public List<Task> getUserTasks() {
        return taskService.getAllTasks();
    } 

    @PostMapping
    public ResponseEntity<Task> addTask(@RequestBody Task task) {
        Task t = taskService.createTask(task);

        if (t != null) {
            return new ResponseEntity<>(t, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(t, HttpStatus.UNAUTHORIZED);
        }
    }

    @GetMapping("/{id}")
    public Optional<Task> getTaskById(@PathVariable Long id) {
        return taskService.getById(id);
    }


    @PutMapping("/{id}")
    public ResponseEntity<Task> updateTaskById(@PathVariable Long id, @RequestBody Task task) {
        return taskService.updateById(id, task)
            .map(ResponseEntity::ok)
            .orElse(ResponseEntity.notFound().build());
    }


    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable Long id) {
        taskService.deleteById(id);
    }


    @GetMapping("/filter")
    public List<Task> filterByPriority(@RequestBody Task task, @RequestParam(required = true) TaskPriority taskPriority) {
        return taskService.filterByPriority(task, taskPriority);
    }



}
