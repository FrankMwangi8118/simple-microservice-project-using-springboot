package com.codify.school_service.Controller;

import com.codify.school_service.Repository.JdbcRepository;
import com.codify.school_service.Repository.Model.School;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
public class SchoolController {

    private final JdbcRepository jdbcRepository;

    public SchoolController(JdbcRepository jdbcRepository) {
        this.jdbcRepository = jdbcRepository;
    }

    @PostMapping
    public School createSchool(@RequestBody School school) {
        return jdbcRepository.createSchool(school);
    }

    @GetMapping("/{id}")
    public Optional<School> findById(@PathVariable String id) {
        return jdbcRepository.findSchoolById(id);
    }
    @GetMapping("/")
    public List<School>getAllSchools(){
        return jdbcRepository.getAllSchool();
    }

}
