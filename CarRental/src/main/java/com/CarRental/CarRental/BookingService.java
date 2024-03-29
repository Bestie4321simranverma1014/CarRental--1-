package com.CarRental.CarRental;

import com.CarRental.CarRental.Entities.Booking;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookingService {
    private final BookingRepository bookingRepository;

    public BookingService(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    public List<Booking> getBookingsByUserId(Long userId) {
        return bookingRepository.findByUserId(userId);
    }
}
