package com.ulas.mapper;

import com.ulas.dto.request.IngretidentSaveRequestDto;
import com.ulas.dto.request.RecipeRequestDto;
import com.ulas.repository.entity.Ingretident;
import com.ulas.repository.entity.Recipe;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IngretidentMapper {
    IngretidentMapper INSTANCE = Mappers.getMapper(IngretidentMapper.class);
    Ingretident toIngretident(final IngretidentSaveRequestDto dto);
}
