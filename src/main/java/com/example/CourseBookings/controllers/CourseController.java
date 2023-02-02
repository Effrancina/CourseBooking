package com.example.CourseBookings.controllers;

import com.example.CourseBookings.models.Booking;
import com.example.CourseBookings.models.Course;
import com.example.CourseBookings.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {
    @Autowired
    CourseRepository courseRepository;

    @GetMapping(value = "/courses")
    public ResponseEntity<List<Course>> getCourse(
            @RequestParam(name="rating", required = false) Integer rating
    ) {
        if(rating != null) {
            return new ResponseEntity<>(courseRepository.findCourseByRating(rating), HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>(courseRepository.findAll(), HttpStatus.OK);
        }
    }
}
