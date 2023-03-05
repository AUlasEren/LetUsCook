package com.ulas.repository.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "tblcomment")
@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    private Date date;
    private String content;
    private Long userid;
    private Long recipeid;
}
