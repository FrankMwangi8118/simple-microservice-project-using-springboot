package com.codify.student_service.Repository;

import com.codify.student_service.Repository.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student,String> {
    Optional<Student> findById(String id);

    Optional<List<Student>> findBySchoolId(String id);
}
