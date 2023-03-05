package com.ulas.service;

import com.ulas.dto.request.CommentsSaveRequestDto;
import com.ulas.mapper.ICommentMapper;
import com.ulas.repository.ICommentRepository;
import com.ulas.repository.entity.Comment;
import com.ulas.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class CommentService extends ServiceManager<Comment,Long> {
    private final ICommentRepository repository;

    public CommentService(ICommentRepository repository) {
        super(repository);
        this.repository = repository;
    }
    public Comment commentSave(CommentsSaveRequestDto dto){
        return save(ICommentMapper.INSTANCE.toComment(dto));
    }
}
