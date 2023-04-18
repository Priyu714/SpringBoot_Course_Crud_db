package com.example.curdoperation_db.controller;

import com.example.curdoperation_db.entity.Course;
import com.example.curdoperation_db.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {

    @Autowired
    private CourseService courseService;

    @GetMapping("Course")
    public List<Course> getCourse()
    {
       return this.courseService.getCourse();
    }

    @GetMapping("/Course/{CourseId}")
    public Course getCourse(@PathVariable String CourseId)
    {
        return this.courseService.getCourses(Long.parseLong(CourseId));
    }

    @PostMapping("Course")
    public Course AddCourse(@RequestBody Course course)
    {
        return this.courseService.addCourses(course);
    }

    @PutMapping("course")
    public Course updateCourse(@RequestBody Course course)
    {
        return this.courseService.updateCourse(course);
    }

    @DeleteMapping("Course/{id}")
    public String deleteCourse(@PathVariable String id){
        return this.courseService.deleteCourse(Long.parseLong(id));
    }
}
