package com.ulas.repository.entity;

import lombok.*;
import org.springframework.context.annotation.Primary;

import javax.persistence.*;
import java.util.List;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "ingretident")
@Entity
public class Ingretident {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private   String name;
    private String unit;
    private int amount;
    @ElementCollection
    private List<Long> recipes;

}
