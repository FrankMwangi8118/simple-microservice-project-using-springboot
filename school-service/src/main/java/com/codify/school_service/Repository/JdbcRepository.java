package com.codify.school_service.Repository;

import com.codify.school_service.Repository.Model.Response;
import com.codify.school_service.Repository.Model.School;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface JdbcRepository {
    School createSchool(School school);

    Optional<School> findSchoolById(String id);

    List<School> getAllSchool();

    Response allSchoolStudent(String schoolId);
}
