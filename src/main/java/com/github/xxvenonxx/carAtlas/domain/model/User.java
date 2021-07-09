package com.github.xxvenonxx.carAtlas.domain.model;


import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

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
        @Column(name = "name", unique = true)
        @NotBlank
        @NotNull
        private String username;
        @Column(name = "email",  unique = true)
        @NotBlank
        @NotNull
        @Email
        private String email;
        @Column(name = "password", nullable = false)
        @NotBlank
        @NotNull
        private String password;
        @Column(nullable = false)
        private String role;
}
