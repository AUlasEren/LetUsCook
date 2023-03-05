package com.ulas.dto.request;

import lombok.*;

import java.util.List;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RecipeRequestDto {
    private String name;
    private int prepTime;
    private int cookTime;
    private List<Long> ingretidents;
}
