package com.github.xxvenonxx.carAtlas.domain.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

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
    @ManyToOne
    //TODO Po kluczach obcych raczej spodziewamy się sufix/prefix id
    @JoinColumn(name = "brand")
    @NotNull
    @ToString.Exclude
    private Brand brand;
    @Column(name = "model")
    @NotNull
    private String model;
    @Column(name = "generation")
    @NotNull
    private int generation;






}
