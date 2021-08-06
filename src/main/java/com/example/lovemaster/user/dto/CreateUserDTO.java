package com.example.lovemaster.user.dto;

import lombok.Data;

@Data
public class CreateUserDTO {
    private String userId;
    private String userPw;
    private String userName;
    private String userPhoneNum;
    private String keyword;
    private String mbti;
    private String introduce;
}
