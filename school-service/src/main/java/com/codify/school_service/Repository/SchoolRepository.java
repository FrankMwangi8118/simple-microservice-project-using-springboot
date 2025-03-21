package com.codify.school_service.Repository;

import com.codify.school_service.Repository.Model.School;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchoolRepository extends JpaRepository<School,String> {
}
