package com.ulas.mapper;

import com.ulas.dto.request.RecipeRequestDto;
import com.ulas.dto.request.UserRegisterRequestDto;
import com.ulas.repository.IRecipeRepository;
import com.ulas.repository.entity.Recipe;
import com.ulas.repository.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IRecipeMapper {
    IRecipeMapper INSTANCE = Mappers.getMapper(IRecipeMapper.class);
    Recipe toRecipe(final RecipeRequestDto dto);
}
