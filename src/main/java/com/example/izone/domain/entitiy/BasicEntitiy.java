package com.example.izone.domain.entitiy;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@Getter

public abstract class BasicEntitiy {


    @Column(
       name = "created_at",
       updatable = false,
       nullable = false)
    @CreatedDate
    private LocalDateTime createdAt;

    @Column(
        name = "last_update_at",
        nullable = false)
    @LastModifiedDate
    private LocalDateTime LastUpdatedAT;

    //무엇을 해야할까............





}
