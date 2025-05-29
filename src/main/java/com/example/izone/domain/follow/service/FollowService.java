package com.example.izone.domain.follow.service;

import com.example.izone.domain.follow.domain.repository.FollowRepository;
import org.springframework.stereotype.Service;

@Service
public class FollowService {
    private final FollowRepository followRepository;

    public FollowService(FollowRepository followRepository) {
        this.followRepository = followRepository;
    }

    public void unfollow(Long followerId, Long followedId){
        // 팔로우레퍼지토리를 이용해서 팔로워 아이디랑 팔로우 아이디 삭제 쿼리 메소드 생성
    }
}
