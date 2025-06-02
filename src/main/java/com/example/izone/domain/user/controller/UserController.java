package com.example.izone.domain.user.controller;

import com.example.izone.domain.entitiy.User;
import com.example.izone.domain.user.dto.request.DeleteRequest;
import com.example.izone.domain.user.dto.request.LoginRequest;
import com.example.izone.domain.user.dto.request.SignupRequest;
import com.example.izone.domain.user.dto.respone.UserResponse;
import com.example.izone.domain.user.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/users")
public class UserController {
    private final UserService userService;

    @PostMapping("/signup")
    public ResponseEntity<String> signup(@RequestBody @Valid SignupRequest signupRequest) {
        userService.signup(signupRequest);
        return ResponseEntity.status(HttpStatus.OK).body("회원가입 완료되었습니다");
    }
    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody @Valid LoginRequest loginRequest){
        User user = userService.login(loginRequest.getEmail(), loginRequest.getPassword());
        UserResponse userResponse = new UserResponse(user);
        return ResponseEntity.status(HttpStatus.OK).body("로그인이 완료되었습니다");

    }

    @DeleteMapping("/delete")
    public ResponseEntity<String> delete(@RequestBody @Valid DeleteRequest deleteRequest) {
        userService.delete(deleteRequest.getEmail(), deleteRequest.getPassword());
        return ResponseEntity.status(HttpStatus.OK).body("회원탈퇴가 완료되었습니다");




}

}