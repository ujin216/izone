package com.example.izone.profile.controller;

import com.example.izone.profile.service.ProfileService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
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

    // 프로필 조회
//    @GetMapping("/users/{userId}/Profile")

    // 프로필 수정
//    @PatchMapping("/users/{userId}Profile")

    // 비밀번호 변경
//    @PatchMapping("/users/{userId}/password")


}
