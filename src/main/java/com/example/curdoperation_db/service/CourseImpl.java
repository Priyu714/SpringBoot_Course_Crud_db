package com.example.curdoperation_db.service;

import com.example.curdoperation_db.Dao.CourseDao;
import com.example.curdoperation_db.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class CourseImpl implements CourseService {

    @Autowired
    private CourseDao courseDao;
    public List<Course> getCourse(){
        return courseDao.findAll();
    }

    @Override
    public Course getCourses(long l) {
         return courseDao.findById(l).get();
    }


    public Course addCourses(Course course){
        return courseDao.save(course);
    }

    @Override
    public Course updateCourse(Course course) {
        return courseDao.save(course);
    }

    @Override
    public String deleteCourse(long l) {

        courseDao.deleteById(l);
        return "Deleted course Successfully";
    }


}
