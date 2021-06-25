package com.github.xxvenonxx.carAtlas.domain.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "cars")
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "brand_name")
    private String brandName;
    @Column(name = "model", nullable = false)
    private String model;
    @Column(name = "generation", nullable = false, unique = true)
    private int generation;
    @Column(name = "country_name")
    private String countryName;

    @ManyToOne
    private Brand brand;



}
