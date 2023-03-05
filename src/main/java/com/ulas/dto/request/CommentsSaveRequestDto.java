package com.ulas.dto.request;

import lombok.*;

import java.util.Date;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor

public class CommentsSaveRequestDto {
    private Date date;
    private String content;
}
