package com.nitesh.springbootjpah2crud.services;

import com.nitesh.springbootjpah2crud.models.Student;
import com.nitesh.springbootjpah2crud.repositores.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student getStudent(Long studentId) {
        return getExistingStudent(studentId).get();
    }


    @Override
    public Student createStudents(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student updateStudents(Student student, Long studentId) {
        Student existingStudent = getExistingStudent(studentId).get();
        if (existingStudent != null) {
           existingStudent.setStudentName(student.getStudentName());
           existingStudent.setContactNumber(student.getContactNumber());
           existingStudent.setEmailAddress(student.getEmailAddress());
           existingStudent.setCourses(student.getCourses());
        }
        return studentRepository.save(existingStudent);
    }

    @Override
    public Boolean deleteStudents(Long studentId) {
        Student existingStudent = getExistingStudent(studentId).get();
        if(existingStudent != null) {
            studentRepository.delete(existingStudent);
        }
        return studentRepository.existsById(studentId) ? false : true;
    }

    private Optional<Student> getExistingStudent(Long studentId) {
        return studentRepository.findById(studentId);
    }
}
