package com.example.izone.domain.follow.controller;

import com.example.izone.domain.follow.service.FollowService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FollowController {
    private FollowService followService;

    public FollowController(FollowService followService) {
        this.followService = followService;
    }


    // unfollow 팔로우 취소
    // http://localhost:8080/follow/{followerId}?followedId={followedId}
    // http://localhost:8080/follow/1?followedId=2
    @DeleteMapping("/follow/{followerId}")
    public ResponseEntity<String> deleteFollowAPI(@PathVariable Long followerId, @RequestParam Long followedId) {
        followService.unfollow(followerId, followedId);
        // 확인용
        System.out.println("followId");
        ResponseEntity<String> response = new ResponseEntity<>("unfollow", HttpStatus.OK);
        return response;
    }
}