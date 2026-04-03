package com.example.TaskFlow.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.TaskFlow.repository.CommentRepository;

import com.example.TaskFlow.entity.Comment;
import com.example.TaskFlow.entity.User;

@Service
public class CommentService {

    private CommentRepository commentRepository;

    @Autowired
    public CommentService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }


    @Transactional
    public Comment createComment(Comment comment) {
        return commentRepository.save(comment);
    }


    @Transactional(readOnly = true) 
    public List<Comment> getAllComments() {
        return commentRepository.findAll();
    }

    @Transactional
    public void deleteById(Comment comment, Long id) {
        commentRepository.deleteById(comment, id);
    }

    @Transactional
    public void deleteByUser(User user) {
        commentRepository.deleteByUser(user);
    }
}
