package com.example.TaskFlow.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.TaskFlow.entity.Comment;
import com.example.TaskFlow.entity.Task;
import com.example.TaskFlow.entity.User;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {

    void deleteById(Comment comment, Long id);
    void deleteByUser(User user);

    public List<Comment> findAll();
    public Optional<Comment> findById(Long id);
    public Optional<Comment> findByTask(Task task);
    public Optional<Comment> findByUser(User user);
}
