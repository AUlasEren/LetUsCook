package com.ulas.repository.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "recipe")
@Entity
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    private String name;
    private int prepTime;
    private int cookTime;
    @ElementCollection
    List<Long> comments;
    @ElementCollection
    List<Long> integretidents;

}
