package com.example.izone.domain.follow.domain.repository;

import com.example.izone.domain.follow.domain.model.Follow;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FollowRepository extends JpaRepository<Follow, Long> {
}
