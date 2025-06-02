package com.example.izone.domain.entitiy;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "users")
@Getter
@NoArgsConstructor

public class User extends BasicEntitiy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @Column(unique = true, nullable = false, length = 200)
    private String email;

    @Column(name = "password_hash", nullable = false, length = 200)
    private String passwordHash;

    @Column(nullable = false, length = 20)
    private String name;

    @Column(length = 300)
    private String intro; //소개글 (null허용)

    @Column(nullable = false)
    private Integer age; //나이


    public User(String email, String passwordHash, String name, String intro, Integer age) {
        this.email = email;
        this.passwordHash = passwordHash;
        this.name = name;
        this.intro = intro != null ? intro : "?";
        this.age = age;

    }
}
