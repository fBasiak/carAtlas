package com.github.xxvenonxx.carAtlas.domain.model;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


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
        @Column(name = "Name", nullable = false, unique = true)
        private String country;

        @OneToMany(mappedBy = "country")
    private List<Country> countryList = new ArrayList<>();
}
