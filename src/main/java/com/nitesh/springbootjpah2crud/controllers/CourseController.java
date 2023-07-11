package com.nitesh.springbootjpah2crud.controllers;

import com.nitesh.springbootjpah2crud.models.Course;
import com.nitesh.springbootjpah2crud.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping("courses")
    public List<Course> getCourses() {
        return courseService.getCourses();
    }

    @GetMapping("courses/{courseId}")
    public Course getCourse(@PathVariable("courseId") Long courseId) {
        return courseService.getCourse(courseId);
    }

    @PostMapping("courses")
    public Course createCourse(@RequestBody Course course) {
        return courseService.createCourse(course);
    }

    @PutMapping("courses/{courseId}")
    public Course updateCourse(@PathVariable("courseId") Long courseId, @RequestBody Course course) {
        return courseService.updateCourse(courseId, course);
    }

    @DeleteMapping("courses/{courseId}")
    public String deleteCourse(@PathVariable("courseId") Long courseId) {
        boolean isDeleted = courseService.deleteCourse(courseId);
        if(isDeleted)
            return "Course with course id : " + courseId + " has been deleted successfully";
        else
            throw new RuntimeException("Error occurred while deleting a course with course id : " + courseId);
    }
}
