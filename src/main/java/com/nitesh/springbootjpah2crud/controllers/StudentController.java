package com.nitesh.springbootjpah2crud.controllers;

import com.nitesh.springbootjpah2crud.models.Student;
import com.nitesh.springbootjpah2crud.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("students")
    public List<Student> getStudents() {
        return studentService.getStudents();
    }

    @GetMapping("students/{studentId}")
    public Student getStudent(@PathVariable("studentId") Long studentId) {
        return studentService.getStudent(studentId);
    }

    @PostMapping("students")
    public Student createStudent(@RequestBody Student student) {
        return studentService.createStudents(student);
    }

    @PutMapping("students/{studentId}")
    public Student updateStudent(@PathVariable("studentId") Long studentId, @RequestBody Student student) {
        return studentService.updateStudents(student, studentId);
    }

    @DeleteMapping("students/{studentId}")
    public String deleteStudent(@PathVariable("studentId") Long studentId) {
        boolean isDeleted = studentService.deleteStudents(studentId);
        if(isDeleted)
            return "Student with Student Id : " + studentId + " has been deleted successfully";
        else
            throw new RuntimeException("Error occurred while deleting student with student id : " + studentId);
    }
}
