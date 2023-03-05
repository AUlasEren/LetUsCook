package com.ulas.mapper;

import com.ulas.controller.CommentController;
import com.ulas.dto.request.CommentsSaveRequestDto;
import com.ulas.dto.request.IngretidentSaveRequestDto;
import com.ulas.repository.entity.Comment;
import com.ulas.repository.entity.Ingretident;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ICommentMapper {
    ICommentMapper INSTANCE = Mappers.getMapper(ICommentMapper.class);
    Comment toComment(final CommentsSaveRequestDto dto);
}
