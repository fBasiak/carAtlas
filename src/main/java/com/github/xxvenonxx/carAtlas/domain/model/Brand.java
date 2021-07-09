package com.github.xxvenonxx.carAtlas.domain.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "brands")
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class Brand {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "brand_name", unique = true)
    @NotNull
    private String name;
    @Column(name= "founder", nullable = false, unique = true)
    private String founder;
    @Column(name = "year_of_establishment", nullable = false, unique = true)
    private Long year;
    @ManyToOne(optional = false)
    @JoinColumn(name="country_id")
    @NotNull
    @ToString.Exclude
    private Country country;


    @OneToMany(mappedBy = "brand")
    @ToString.Exclude
    private List<Car> carList = new ArrayList<>();



}
