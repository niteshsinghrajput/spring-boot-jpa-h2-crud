package com.nitesh.springbootjpah2crud.services;

import com.nitesh.springbootjpah2crud.models.Student;

import java.util.List;

public interface StudentService {
    List<Student> getStudents();
    Student getStudent(Long studentId);
    Student createStudents(Student student);
    Student updateStudents(Student student, Long studentId);
    Boolean deleteStudents(Long studentId);
}
