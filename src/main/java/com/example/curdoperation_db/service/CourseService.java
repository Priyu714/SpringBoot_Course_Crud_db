package com.example.curdoperation_db.service;

import com.example.curdoperation_db.entity.Course;

import java.util.List;

public interface CourseService {
    List<Course> getCourse();


    Course getCourses(long l);

    Course addCourses(Course course);

    Course updateCourse(Course course);

    String deleteCourse(long l);
}
