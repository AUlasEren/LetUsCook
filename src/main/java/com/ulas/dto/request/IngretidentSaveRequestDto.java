package com.ulas.dto.request;

import lombok.*;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor

public class IngretidentSaveRequestDto {
    private   String name;
    private String unit;
    private int amount;
}

