package com.nitesh.springbootjpah2crud.repositores;

import com.nitesh.springbootjpah2crud.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
