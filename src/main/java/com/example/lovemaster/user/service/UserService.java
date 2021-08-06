package com.example.lovemaster.user.service;

import com.example.lovemaster.user.domain.User;
import com.example.lovemaster.user.dto.CreateUserDTO;
import com.example.lovemaster.user.dto.LoginUserDTO;
import com.example.lovemaster.user.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
@Transactional
public class UserService {
    private UserRepository userRepository;
    public ResponseEntity<String> register(CreateUserDTO userDTO){
        User user=User.createUser(userDTO.getUserId(), userDTO.getUserPw(), userDTO.getUserName(), userDTO.getUserPhoneNum(), userDTO.getKeyword(), userDTO.getMbti(), userDTO.getIntroduce());
        userRepository.save(user);
    return ResponseEntity.ok().body(userDTO.getUserId());
    }

    public ResponseEntity<String> login(LoginUserDTO userDTO){
        if(userRepository.finduser(userDTO.getUserId(), userDTO.getUserPw())==null){
            return ResponseEntity.ok().body("fail");
        }else return ResponseEntity.ok().body(userDTO.getUserId());
    }
}
