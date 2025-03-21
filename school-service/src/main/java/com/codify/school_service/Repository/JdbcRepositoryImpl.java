package com.codify.school_service.Repository;

import com.codify.school_service.Repository.Model.School;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class JdbcRepositoryImpl implements JdbcRepository {
    private final SchoolRepository schoolRepository;

    public JdbcRepositoryImpl(SchoolRepository schoolRepository) {
        this.schoolRepository = schoolRepository;
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
}
