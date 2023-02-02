package com.example.CourseBookings.repositories;

import com.example.CourseBookings.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {


}
