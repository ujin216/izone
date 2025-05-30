package com.example.izone.domain.follow.domain.dto;

public class UnfollowResponseDto {
    private int status;
    private String data;
    private String message;

    public UnfollowResponseDto(int status, String data, String message){
        this.status = status;
        this.data = data;
        this.message = message;
    }
    public int getStatus(){
        return status;
    }

    public String getData(){
        return data;
    }

    public String getMessage(){
        return message;
    }
}
