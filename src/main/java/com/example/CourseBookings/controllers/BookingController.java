package com.example.CourseBookings.controllers;

import com.example.CourseBookings.models.Booking;
import com.example.CourseBookings.repositories.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookingController {
    @Autowired
    BookingRepository bookingRepository;

    @GetMapping(value = "/bookings")
    public ResponseEntity<List<Booking>> getBookings() {
        return new ResponseEntity<>(bookingRepository.findAll(), HttpStatus.OK);
    }
}
