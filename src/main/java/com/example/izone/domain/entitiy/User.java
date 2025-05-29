package com.example.izone.domain.entitiy;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "users")
@Getter

public class User extends BasicEntitiy {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false, length = 200)
    private String email;

    @Column(name = "password_hash", nullable = false, length = 200)
    @Setter
    private String passwordHash;

    @Column(nullable = false, length = 200)
    @Setter
    private String name;

    @Column(length = 300)
    @Setter
    private String intro;

    @Column(nullable = false)
    @Setter
    private Integer age;

    public User(String email, String encodePassword, String name, String intro, Integer age) {
        this.email = email;
        this.passwordHash = encodePassword;
        this.name = name;
        this.intro = intro;
        this.age = age;


    }

}
