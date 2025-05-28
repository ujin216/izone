package com.example.izone.profile.controller;

import com.example.izone.profile.service.ProfileService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


// 어노테이션
@RestController
@RequestMapping("/users")
public class ProfileController {

    // 속성
//    private final ProfileService profileService;

    // 생성자
    public ProfileController(ProfileService profileService) {

    }

    // 기능
}
