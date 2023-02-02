package com.example.CourseBookings.components;

import com.example.CourseBookings.models.Booking;
import com.example.CourseBookings.models.Course;
import com.example.CourseBookings.models.Customer;
import com.example.CourseBookings.repositories.BookingRepository;
import com.example.CourseBookings.repositories.CourseRepository;
import com.example.CourseBookings.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;


//@Component
public class DataLoader implements ApplicationRunner {
    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    CourseRepository courseRepository;

    public DataLoader(){

    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Customer customer1 = new Customer("Gertude", "Cork", 85);
        customerRepository.save(customer1);

        Customer customer2 = new Customer("Fred", "Bedrock", 1000);
        customerRepository.save(customer2);

        Course course1 = new Course("Knitting", "Cork", 3);
        courseRepository.save(course1);

        Course course2 = new Course("Skydiving", "Mount Everest", 5);
        courseRepository.save(course2);

        Booking booking1 = new Booking("2023-02-20", course1, customer1);
        bookingRepository.save(booking1);

        Booking booking2 = new Booking("2023-04-07", course2, customer2);
        bookingRepository.save(booking2);
    }
}
