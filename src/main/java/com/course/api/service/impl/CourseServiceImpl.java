package com.course.api.service.impl;

import com.course.api.entity.Course;
import com.course.api.service.CourseService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    List<Course> list;

    public CourseServiceImpl() {
        list = new ArrayList<>();
        list.add(new Course(145, "Java Core Course", "This course contains basics of java"));
        list.add(new Course(4343, "Spring Boot Course", "Creating rest api using spring boot"));
    }

    @Override
    public List<Course> getCourses() {
        return list;
    }

    @Override
    public Course getCourse(long courseId) {
        Course c = null;
        for(Course course: list) {
            if(course.getId() == courseId) {
                c = course;
                break;
            }
        }
        return c;
    }


}
