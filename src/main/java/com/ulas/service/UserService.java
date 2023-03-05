package com.ulas.service;

import com.ulas.dto.request.UserRegisterRequestDto;
import com.ulas.mapper.IUserMapper;
import com.ulas.repository.IUserRepository;
import com.ulas.repository.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private IUserRepository userRepository;


    public User createUser(UserRegisterRequestDto dto){
        User user = IUserMapper.INSTANCE.toUser(dto);
        return userRepository.save(user);
    }



}
