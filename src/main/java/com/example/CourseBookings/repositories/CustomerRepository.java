package com.example.CourseBookings.repositories;

import com.example.CourseBookings.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    List<Customer> findCustomersByBookingsCourseNameIgnoreCase(String courseName);
}
