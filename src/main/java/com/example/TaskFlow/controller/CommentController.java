package com.example.TaskFlow.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.TaskFlow.service.CommentService;
import com.example.TaskFlow.entity.Comment;



@RestController
@RequestMapping("/api/tasks")
public class CommentController {

    private CommentService commentService;

    @Autowired
    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }


    @PostMapping("/{id}/comments")
    public Comment addComment(@PathVariable Long id, @RequestBody Comment comment) {
        return commentService.createComment(comment);
    }

    @GetMapping("/{id}/comments")
    public List<Comment> getComments(@PathVariable Long id, @RequestBody Comment comment) {
        return commentService.getAllComments();
    }
    
}
