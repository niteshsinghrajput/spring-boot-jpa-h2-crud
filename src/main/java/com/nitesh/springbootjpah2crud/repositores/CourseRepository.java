package com.nitesh.springbootjpah2crud.repositores;

import com.nitesh.springbootjpah2crud.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
}
