package com.github.xxvenonxx.carAtlas.domain.model;


import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Email;

@Entity
    @Table(name = "users")
    @NoArgsConstructor
    @AllArgsConstructor
    @ToString
    @Getter
    @Setter
    public class User {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        @Column(name = "name", nullable = false, unique = true)
        private String name;
        @Column(name = "email", nullable = false, unique = true)
        @Email
        private String email;
        @Column(name = "password", nullable = false)
        private String password;
}
