package com.codify.student_service.Repository;

import com.codify.student_service.Repository.Dtos.School;
import com.codify.student_service.Repository.Dtos.StudentResponse;
import com.codify.student_service.Repository.Model.Student;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.client.RestClientException;

import java.util.List;
import java.util.Optional;

@Service
public class StudentRepoImpl implements StudentRepo {

    private final StudentRepository studentRepository;
    private final RestTemplate restTemplate;

    public StudentRepoImpl(StudentRepository studentRepository, RestTemplate restTemplate) {
        this.studentRepository = studentRepository;
        this.restTemplate = restTemplate;
    }

    @Override
    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Optional<Student> getStudentById(String id) {
        return studentRepository.findById(id);
    }

    @Override
    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }

    @Override
    public StudentResponse fetchStudentById(String id) {
        Optional<Student> studentOptional = studentRepository.findById(id);

        if (!studentOptional.isPresent()) {
            throw new RuntimeException("Student with id " + id + " not found");
        }

        Student student = studentOptional.get();

        School school = null;
        try {
            school = restTemplate.getForObject("http://localhost:8082/" + student.getSchoolId(), School.class);
        } catch (RestClientException e) {
            throw new RuntimeException("Error while fetching school data", e);
        }

        if (school == null) {
            throw new RuntimeException("School data not found for school ID " + student.getSchoolId());
        }

        return new StudentResponse(
                student.getId(),
                student.getName(),
                student.getGender(),
                school
        );
    }

    @Override
    public Optional<Student> getbyTheId(String id) {
       return studentRepository.findById(id);
    }
}
