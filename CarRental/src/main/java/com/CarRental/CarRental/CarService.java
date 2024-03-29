package com.CarRental.CarRental;
import com.CarRental.CarRental.Entities.Booking;
import com.CarRental.CarRental.Entities.Car;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CarService {
    private final CarRepository carRepository;
    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public List<Car> getCarsByCity(String city) {
        return carRepository.findByCity(city);
    }
}
