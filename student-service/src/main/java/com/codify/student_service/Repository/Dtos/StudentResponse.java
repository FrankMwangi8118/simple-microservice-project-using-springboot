package com.codify.student_service.Repository.Dtos;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

public class StudentResponse {
    private String id;
    private String name;
    private String gender;
    private School school;


    public StudentResponse(String id, String name, String gender, School school) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.school = school;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }



    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }
}
