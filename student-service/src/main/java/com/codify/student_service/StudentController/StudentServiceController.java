package com.codify.student_service.StudentController;

import com.codify.student_service.Repository.Dtos.StudentResponse;
import com.codify.student_service.Repository.Model.Student;
import com.codify.student_service.Repository.StudentRepo;
import org.springframework.web.bind.annotation.*;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;
import java.util.Optional;
@CrossOrigin("*")
@RestController
public class StudentServiceController {
    private final StudentRepo studentRepo;

    public StudentServiceController(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    @PostMapping("/")
    public Student createSTudent(@RequestBody Student student) {

        return studentRepo.createStudent(student);
    }

    @GetMapping("/{id}")
    public StudentResponse getStudentById(@PathVariable String id) {
        return studentRepo.fetchStudentById(id);
    }

    @GetMapping("/stud/{id}")
    public Optional<Student> getstudent(@PathVariable String id) {
        return studentRepo.getbyTheId(id);
    }
    @GetMapping("/student/{id}")
    public Optional<List<Student>> getstudents(@PathVariable String id){
        return studentRepo.getStudentsById(id);
    }

}
