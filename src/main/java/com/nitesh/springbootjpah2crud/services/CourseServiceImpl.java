package com.nitesh.springbootjpah2crud.services;

import com.nitesh.springbootjpah2crud.models.Course;
import com.nitesh.springbootjpah2crud.repositores.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseRepository courseRepository;

    @Override
    public Course createCourse(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public List<Course> getCourses() {
        return courseRepository.findAll();
    }

    @Override
    public Course getCourse(Long courseId) {
        return getExistingCourse(courseId).get();
    }

    private Optional<Course> getExistingCourse(Long courseId) {
        return courseRepository.findById(courseId);
    }

    @Override
    public Course updateCourse(Long courseId, Course course) {
        Course existingCourse = getExistingCourse(courseId).get();
        if (existingCourse != null) {
            existingCourse.setCourseName(course.getCourseName());
            existingCourse.setDuration(course.getDuration());
            existingCourse.setStudents(course.getStudents());
        }
        return courseRepository.save(course);
    }

    @Override
    public boolean deleteCourse(Long courseId) {
        Course existingCourse = getExistingCourse(courseId).get();
        if(existingCourse != null) {
            courseRepository.delete(existingCourse);
        }
        return courseRepository.existsById(courseId) ? false : true;
    }
}
