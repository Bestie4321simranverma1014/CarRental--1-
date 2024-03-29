package com.CarRental.CarRental;

import com.CarRental.CarRental.Entities.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BookingRepository extends JpaRepository<Booking, Long> {
    @Query(value = "SELECT * FROM bookings WHERE user_id = :user_id", nativeQuery = true)
    List<Booking> findByUserId(@Param("user_id") Long userId);
}
