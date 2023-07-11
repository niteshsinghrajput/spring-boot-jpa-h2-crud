package com.nitesh.springbootjpah2crud.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "student")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    @JsonProperty("student_id")
    private Long studentId;

    @Column(name = "student_name")
    @JsonProperty("student_name")
    private String studentName;

    @Column(name = "email_address")
    @JsonProperty("email_address")
    private String emailAddress;

    @Column(name = "contact_number")
    @JsonProperty("contact_number")
    private String contactNumber;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "students_courses",
            joinColumns = {
                    @JoinColumn(name = "student_id", referencedColumnName = "student_id")
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "course_id", referencedColumnName = "course_id")
            }
    )
    Set<Course> courses;
}
