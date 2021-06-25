package com.github.xxvenonxx.carAtlas.domain.repository;

import com.github.xxvenonxx.carAtlas.domain.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
