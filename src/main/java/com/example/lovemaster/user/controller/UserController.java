package com.example.lovemaster.user.controller;

import com.example.lovemaster.user.dto.CreateUserDTO;
import com.example.lovemaster.user.service.UserService;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@CrossOrigin
@RestController
@AllArgsConstructor
//생성자주입역할
@RequestMapping("/api/user")
public class UserController {
    private final UserService userService;


    @ApiOperation("회원가입하는 기능")
    @PostMapping("/register")
    public ResponseEntity<String> registerPOST(CreateUserDTO userDTO, RedirectAttributes redirectAttributes){
        return userService.register(userDTO);
    }

}
