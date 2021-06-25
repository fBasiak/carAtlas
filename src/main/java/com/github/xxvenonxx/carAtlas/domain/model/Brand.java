package com.github.xxvenonxx.carAtlas.domain.model;

import lombok.*;

import javax.persistence.*;
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
    @Column(name = "name", nullable = false, unique = true)
    private String name;
    @Column(name= "founder", nullable = false, unique = true)
    private String founder;
    @Column(name = "year_of_establishment", nullable = false, unique = true)
    private Long year;
    @Column(name = "country_name")
    private String countryName;

    @ManyToOne
    private Country country;
    @OneToMany(mappedBy = "brand")
    private List<Brand> brandList = new ArrayList<>();


}
