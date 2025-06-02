package com.example.izone.domain.profile.Dto;

import lombok.Getter;

// 어노테이션
@Getter
public class ProfileRequestDto {

    // 속성
    private final String name;
    private final String intro;
    private final int age;

    // 생성자
    public ProfileRequestDto(String name, String intro, int age){

        this.name = name;
        this.intro = intro;
        this.age = age;

    }
}


