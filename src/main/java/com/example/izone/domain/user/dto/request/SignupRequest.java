package com.example.izone.domain.user.dto.request;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;

@Getter

public class SignupRequest {

    @NotBlank(message = "이메일을 입력하세요")
    @Pattern(regexp = "\"^[\\w!#$%&'*+/=?`{|}~^.-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$\"",message = "이메일 형식이 올바르지 않습니다.")
    private String email;

    @NotBlank(message = "비밀번호를 입력하세요")
    @Pattern(regexp = "^(?=.*[a-zA-Z])(?=.*\\d)(?=.*[@$!%*?&#])[A-Za-z\\d@$!%*?&#]{8,}$", message = "비밀번호 형식이 올바르지 않습니다. 최소 8자 이상 대소문자 포함, 숫자 및 특수문자 포함")
    private String password;

    @NotBlank(message = "비밀번호를 확인하세요")
    @Pattern(regexp = "^(?=.*[a-zA-Z])(?=.*\\d)(?=.*[@$!%*?&#])[A-Za-z\\d@$!%*?&#]{8,}$", message = "비밀번호 형식이 올바르지 않습니다. 최소 8자 이상 대소문자 포함, 숫자 및 특수문자 포함")
    private String passwordCheck;

    @NotBlank(message = "이름을 최소 두글자 이상 입력해주세요.")
    @Size(min = 1, max = 20)
    private String name;

    @Size(max = 300, message = "소개글은 최대 300자 입니다.")
    private String intro = "";

    @NotBlank(message = "나이를 입력해주세요.")
    private Integer age;


}
