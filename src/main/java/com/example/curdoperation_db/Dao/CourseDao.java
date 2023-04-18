package com.example.curdoperation_db.Dao;

import com.example.curdoperation_db.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseDao extends JpaRepository<Course, Long> {
}
