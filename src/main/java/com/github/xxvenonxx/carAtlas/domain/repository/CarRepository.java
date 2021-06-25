package com.github.xxvenonxx.carAtlas.domain.repository;


import com.github.xxvenonxx.carAtlas.domain.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {
}
