package com.ulas.controller;

import com.ulas.dto.request.UserRegisterRequestDto;
import com.ulas.repository.entity.User;
import com.ulas.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping("/save")
    public ResponseEntity<User> createUser(@RequestBody UserRegisterRequestDto dto){
        return ResponseEntity.ok(userService.createUser(dto));
    }
}


