package com.example.lovemaster.user.domain;

import com.example.lovemaster.user.dto.CreateUserDTO;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class User {
    @Id
    private String userId;
    private String userPw;
    private String userName;
    private String userPhoneNum;
    private String keyword;
    private String mbti;
    private String introduce;
    public static User createUser(String userId,String userPw,String userName,String userPhoneNum,String keyword,String mbti,String introduce) {
        User user = new User();
        user.userId = userId;
        user.userPw = userPw;
        user.userName = userName;
        user.userPhoneNum = userPhoneNum;
        user.keyword = keyword;
        user.mbti = mbti;
        user.introduce = introduce;

        return user;
    }
}

