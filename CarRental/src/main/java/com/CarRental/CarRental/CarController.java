package com.CarRental.CarRental;

import com.CarRental.CarRental.Entities.Booking;
import com.CarRental.CarRental.Entities.Car;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cars")
public class CarController {

    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars/{city}")
    public ResponseEntity<List<Car>> getBookingsByUserId(@PathVariable String city) {
        List<Car> cars = carService.getCarsByCity(city);
        return ResponseEntity.ok(cars);
    }

}
