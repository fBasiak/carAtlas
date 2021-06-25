package com.github.xxvenonxx.carAtlas.service;

import com.github.xxvenonxx.carAtlas.domain.model.Car;

import java.util.List;

public interface CarService {
    Car getCarById(Long carId);
    Car addCar(Car carToAdd);
    void updateCar(Car carToUpdated);
    void deleteCar(Long carId);
    List<Car> getCars();

}
