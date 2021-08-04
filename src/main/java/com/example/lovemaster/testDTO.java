package com.example.lovemaster;

import lombok.Builder;
import lombok.Data;

@Data
public class testDTO {
    private String name;
    private int age;
    private String friend;

    @Builder
    public testDTO(String name, int age, String friend) {
        this.name = name;
        this.age = age;
        this.friend = friend;
    }
}
