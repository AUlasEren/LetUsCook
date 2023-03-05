package com.ulas.controller;

import com.ulas.dto.request.RecipeRequestDto;
import com.ulas.dto.request.UserRegisterRequestDto;
import com.ulas.repository.entity.Recipe;
import com.ulas.repository.entity.User;
import com.ulas.service.RecipeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/recipe")
@RequiredArgsConstructor
public class RecipeController {
    private final RecipeService recipeService;
    @PostMapping("/save")
    public ResponseEntity<Recipe> recipSave(@RequestBody RecipeRequestDto dto){
        return ResponseEntity.ok(recipeService.recipeSave(dto));
    }

}
