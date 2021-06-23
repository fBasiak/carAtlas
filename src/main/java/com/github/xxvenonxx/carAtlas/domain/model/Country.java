package com.github.xxvenonxx.carAtlas.domain.model;

import lombok.*;

import javax.persistence.*;


@Entity
    @Table(name = "countries")
    @NoArgsConstructor
    @AllArgsConstructor
    @ToString
    @Getter
    @Setter
    public class Country {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        @Column(name = "country", nullable = false, unique = true)
        private String country;

}
