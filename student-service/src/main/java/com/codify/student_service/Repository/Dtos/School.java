package com.codify.student_service.Repository.Dtos;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
public class School {

    private String id;
    private String name;
    private String location;
    private String principalName;


    public String getPrincipalName() {
        return principalName;
    }

    public String getLocation() {
        return location;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }
}