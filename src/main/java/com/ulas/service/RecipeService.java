package com.ulas.service;

import com.ulas.dto.request.RecipeRequestDto;
import com.ulas.mapper.IRecipeMapper;
import com.ulas.repository.IRecipeRepository;
import com.ulas.repository.entity.Recipe;
import com.ulas.utility.ServiceManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecipeService extends ServiceManager<Recipe,Long> {
    private final IRecipeRepository repository;
    public RecipeService(IRecipeRepository repository){
        super(repository);
        this.repository = repository;
    }

    public Recipe recipeSave(RecipeRequestDto dto){
        return save(IRecipeMapper.INSTANCE.toRecipe(dto));
    }

}
