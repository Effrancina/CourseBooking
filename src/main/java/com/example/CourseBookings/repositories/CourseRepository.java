package com.example.CourseBookings.repositories;


import com.example.CourseBookings.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long> {
    List<Course> findCourseByRating(int rating);
}
