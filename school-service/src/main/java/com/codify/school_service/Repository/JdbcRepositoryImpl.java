package com.codify.school_service.Repository;

import com.codify.school_service.Repository.Model.Response;
import com.codify.school_service.Repository.Model.School;
import com.codify.school_service.Repository.Model.Student;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
@Service
public class JdbcRepositoryImpl implements JdbcRepository {
    private final SchoolRepository schoolRepository;
    private final RestTemplate restTemplate;
    public JdbcRepositoryImpl(SchoolRepository schoolRepository, RestTemplate restTemplate) {
        this.schoolRepository = schoolRepository;
        this.restTemplate = restTemplate;
    }

    @Override
    public School createSchool(School school) {

        return schoolRepository.save(school);
    }

    @Override
    public Optional<School> findSchoolById(String id) {
        return schoolRepository.findById(id);
    }

    @Override
    public List<School> getAllSchool() {
        return schoolRepository.findAll();
    }

    /**
     * @param schoolId 
     * @return
     */
    @Override
    public Response allSchoolStudent(String schoolId) {
        Optional <School> schooll=schoolRepository.findById(schoolId);
        Student[] stud= restTemplate.getForObject("http://127.0.0.1:8083/student" + "/" + schoolId, Student[].class);
        List<Student> studentList = stud != null ? Arrays.asList(stud) : new ArrayList<>();
        return new Response(
                schooll.get().getId(),
                schooll.get().getName(),
                schooll.get().getLocation(),
                schooll.get().getPrincipalName(),
                studentList

        );

    }


}
