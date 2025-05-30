package com.example.izone.domain.follow.domain.model;


import com.example.izone.domain.entitiy.User;
import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Entity
public class Follow {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "follower_id")
    private User followerId;
    @ManyToOne
    @JoinColumn(name = "followed_id")
    private User followedId;
}
