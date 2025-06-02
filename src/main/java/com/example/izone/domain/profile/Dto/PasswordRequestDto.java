package com.example.izone.domain.profile.Dto;


import lombok.Getter;

// 어노테이션
@Getter
public class PasswordRequestDto {

    // 속성
    private String existingpw;
    private String newpw;

    // 생성자
    public PasswordRequestDto (String existingpw, String newpw){

        this.existingpw = existingpw;
        this.newpw = newpw;

    }
}
