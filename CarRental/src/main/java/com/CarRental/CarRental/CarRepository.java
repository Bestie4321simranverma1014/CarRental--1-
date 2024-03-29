package com.CarRental.CarRental;

import com.CarRental.CarRental.Entities.Booking;
import com.CarRental.CarRental.Entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CarRepository extends JpaRepository<Car, Long> {
    @Query(value = "SELECT * FROM mst_car WHERE city = :city", nativeQuery = true)
    List<Car> findByCity(@Param("city") String city);
}
