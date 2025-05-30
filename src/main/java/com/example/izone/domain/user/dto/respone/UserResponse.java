package com.example.izone.domain.user.dto.respone;


import com.example.izone.domain.entitiy.User;
import lombok.Getter;

@Getter
public class UserResponse {

    private String email;
    private String name;
    private String intro;
    private Integer age;

    public UserResponse(User user) {
        this.email = user.getEmail();
        this.name = user.getName();
        this.intro = user.getIntro();
        this.age = user.getAge();




    }





}
