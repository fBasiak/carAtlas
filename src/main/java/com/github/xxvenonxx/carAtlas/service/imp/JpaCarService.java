package com.github.xxvenonxx.carAtlas.service.imp;

import com.github.xxvenonxx.carAtlas.domain.model.Car;
import com.github.xxvenonxx.carAtlas.domain.repository.CarRepository;
import com.github.xxvenonxx.carAtlas.service.CarService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
@Slf4j
public class JpaCarService implements CarService {
    private final CarRepository carRepository;

    public JpaCarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Override
    public Car getCarById(Long carId) {
        return carRepository.getById(carId);
    }

    @Override
    public Car addCar(Car carToAdd) {
        log.info("Saving car " + carToAdd);
        return carRepository.save(carToAdd);
    }


    @Override
    public void updateCar(Car carToUpdated) {
        log.info("Updating car " + carToUpdated);
        Car car = getCarById(carToUpdated.getId());
        car.setBrandName(carToUpdated.getBrandName());
        car.setCountryName(carToUpdated.getCountryName());
        car.setModel(carToUpdated.getModel());
        car.setGeneration(carToUpdated.getGeneration());
        carRepository.save(car);
    }


    @Override
    public void deleteCar(Long carId) {
        Car car = getCarById(carId);
        log.info("Deleting car " + car);
        carRepository.delete(car);
    }

    @Override
    public List<Car> getCars() {
       return carRepository.findAll();
    }
}
