package com.ulas.repository.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "tblUser")
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    String username;
    String email;
    String password;
    @ElementCollection
    private List<Long> comments;
}
