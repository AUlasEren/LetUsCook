package com.ulas.dto.request;

import lombok.*;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserRegisterRequestDto {
    String name;
    String username;
    String email;
    String password;
}
