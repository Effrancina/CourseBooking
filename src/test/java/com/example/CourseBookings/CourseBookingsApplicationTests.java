package com.example.CourseBookings;

import com.example.CourseBookings.models.Course;
import com.example.CourseBookings.models.Customer;
import com.example.CourseBookings.repositories.CourseRepository;
import com.example.CourseBookings.repositories.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CourseBookingsApplicationTests {

	@Autowired
	CustomerRepository customerRepository;

	@Autowired
	CourseRepository courseRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void canGetCustomersOnACourse() {
		/*
		We have: Course Name ("Knitting")
		We want: list of customers

		course -> bookings -> customer
		 */
		List<Customer> customers = customerRepository.findCustomersByBookingsCourseNameIgnoreCase("Knitting");
		assertEquals("Knitting", customers.get(0).getBookings().get(0).getCourse().getName());
	}

	@Test
	public void canGetCoursesByRating(){
		List<Course> courses = courseRepository.findCourseByRating(3);
		assertEquals(3, courses.get(0).getRating());
	}
}
