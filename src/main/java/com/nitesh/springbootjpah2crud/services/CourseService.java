package com.nitesh.springbootjpah2crud.services;

import com.nitesh.springbootjpah2crud.models.Course;

import java.util.List;

public interface CourseService {
    Course createCourse(Course course);
    List<Course> getCourses();
    Course getCourse(Long courseId);
    Course updateCourse(Long courseId, Course course);
    boolean deleteCourse(Long courseId);
}
