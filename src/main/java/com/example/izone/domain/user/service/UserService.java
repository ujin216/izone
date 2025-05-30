package com.example.izone.domain.user.service;

import com.example.izone.config.PasswordEncoder;
import com.example.izone.domain.entitiy.User;
import com.example.izone.domain.user.dto.request.SignupRequest;
import com.example.izone.domain.user.repository.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    //회원가입
    @Transactional
    public void signup(SignupRequest signupRequest) {
    //이메일 중복검사 작성 //다시 작성해야됨
    if (userRepository.existsByEmail(signupRequest.getEmail()))
        throw new IllegalArgumentException("이미 등록된 이메일입니다");



    //비밀번호와 비밀번호 확인이 일치하는지 검사//아직 작성 중
    if (!signupRequest.getPassword().equals(signupRequest.getPasswordCheck())){
        throw new IllegalArgumentException("비밀번호와 비밀번호 확인이 일치하지 않습니다.");
    }
    String encodePassword = passwordEncoder.encode(signupRequest.getPassword());

    User user = new User(
        signupRequest.getEmail(),
        encodePassword,
        signupRequest.getName(), signupRequest.getIntro(),
        signupRequest.getAge()
    );

    }




    //로그인


    //회원탈퇴





}










