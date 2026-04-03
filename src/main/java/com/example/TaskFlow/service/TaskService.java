package com.example.TaskFlow.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.TaskFlow.repository.TaskRepository;

import java.util.List;
import java.util.Optional;

import com.example.TaskFlow.entity.Task;
import com.example.TaskFlow.enums.task.TaskPriority;

@Service
public class TaskService {

    private TaskRepository taskRepository;

    @Autowired
    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }


    @Transactional(readOnly = true)
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    @Transactional
    public Task createTask(Task task) {
        taskRepository.save(task);
        return task;
    }


    @Transactional(readOnly = true)
    public Optional<Task> getById(Long id) {
        return taskRepository.findById(id);
    }


    @Transactional
    public Optional<Task> updateById(Long id, Task t) {
        return taskRepository.findById(id).map(task -> {
            task.setTitle(t.getTitle());
            task.setDescription(t.getDescription());
            task.setStatus(t.getStatus());
            task.setPriority(t.getPriority());
            task.setDueDate(t.getDueDate());
            task.setCategory(t.getCategory());
            task.setUpdatedAt(t.getUpdatedAt());

            return task;
        });
    }


    @Transactional
    public void deleteById(Long id) {
        taskRepository.deleteById(id);
    }


    @Transactional
    public List<Task> filterByPriority(Task task, TaskPriority taslPriority) {
        return taskRepository.findByPriority(task, taskRepository);
    }

}
