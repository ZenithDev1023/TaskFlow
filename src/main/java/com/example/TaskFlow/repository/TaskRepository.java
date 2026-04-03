package com.example.TaskFlow.repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.TaskFlow.entity.Task;
import com.example.TaskFlow.enums.task.TaskPriority;
import com.example.TaskFlow.service.TaskService;
import com.example.TaskFlow.entity.Category;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

    void deleteById(Long id);
    void deleteByPriority(TaskPriority taskPriority);

    public List<Task> findAll();
    public Optional<Task> findById(Long id);
    public List<Task> findByPriority(Task task, TaskRepository taskRepository);
    public List<Task> findByDueDate(LocalDateTime dueDate);
    public List<Task> findByCategory(Category category);
}
