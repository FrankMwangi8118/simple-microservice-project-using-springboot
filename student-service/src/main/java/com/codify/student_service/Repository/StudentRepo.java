package com.codify.student_service.Repository;

import com.codify.student_service.Repository.Dtos.StudentResponse;
import com.codify.student_service.Repository.Model.Student;

import java.util.List;
import java.util.Optional;

public interface StudentRepo {

    Student createStudent(Student student);

    Optional<Student> getStudentById(String id);

    List <Student> getAllStudent();

    StudentResponse fetchStudentById(String id);


    Optional<Student> getbyTheId(String id);
}
