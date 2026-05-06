package com.course.api.service;

import com.course.api.entity.Course;

import java.util.List;

public interface CourseService {

    public List<Course> getCourses();
    public Course getCourse(long courseId);
}
