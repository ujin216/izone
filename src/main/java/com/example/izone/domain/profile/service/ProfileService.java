package com.example.izone.domain.profile.service;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

// 어노테이션
@Service

public class ProfileService {

    // 속성

    // 생성자
    ProfileService(UserRepository userRepository, PasswordEncoder passwordEncoder){

        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;


    }

    // 기능
        // 프로필 조회
    @Transactional
    public ProfileResponseDto getProfile(Long userId) {
        User findUser = userRepository.findById(userId)
                .orElseThrow(() -> new IllegalAccessException("요청하신 사용자를 찾을 수 없습니다."));
    }


        // 프로필 수정
    @Transactional
    public void editProfile = (Long userId, ProfileRequestDto editDto) {
        User findUser = userRepository.findById(userId)
                .orElseThrow(() -> new IllegalAccessException("요청하신 사용자를 찾을 수 없습니다."));
    }



        // 비밀번호 변경



            // 현재 비밀번호 확인


            // 새 비밀번호가 현재와 같은지 확인


            // 비밀번호 형식 확인






}
