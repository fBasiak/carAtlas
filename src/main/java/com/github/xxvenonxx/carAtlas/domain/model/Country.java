package com.github.xxvenonxx.carAtlas.domain.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
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
        //TODO Samo name jest spoko, bo to w końcu klasa Country/tabela countries więc jest jednoznaczne
        @Column(name = "country_name", unique = true)
        @NotBlank
        @NotNull
        private String name;
        @OneToMany(mappedBy = "country")
        @ToString.Exclude
    private List<Brand> brandList = new ArrayList<>();


}
