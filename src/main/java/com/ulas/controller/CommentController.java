package com.ulas.controller;

import com.ulas.dto.request.CommentsSaveRequestDto;
import com.ulas.repository.entity.Comment;
import com.ulas.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/comment")
@RequiredArgsConstructor
public class CommentController {
    private final CommentService commentService;
    @PostMapping("/save")
    public ResponseEntity<Comment> commentSave(@RequestBody CommentsSaveRequestDto dto){
        return ResponseEntity.ok(commentService.commentSave(dto));
    }
}
