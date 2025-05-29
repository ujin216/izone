package com.example.izone.domain.user.controller;

import com.example.izone.domain.user.dto.request.SignupRequest;
import com.example.izone.domain.user.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

@PostMapping("/signup")
public ResponseEntity<Void> signup(@RequestBody @Valid SignupRequest request) {
    userService.signup(request.getEmail(),
            request.getPassword(), request.getName(), request.getIntro(), request.getAge());
        return ResponseEntity.status(HttpStatus.OK).build();}
}
