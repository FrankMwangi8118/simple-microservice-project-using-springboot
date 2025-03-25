package com.codify.school_service.Repository.Model;

import java.util.List;

public class Response {

    private String id;
    private String name;
    private String location;
    private String principalName;
    private List <Student>studentList;

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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPrincipalName() {
        return principalName;
    }

    public void setPrincipalName(String principalName) {
        this.principalName = principalName;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public Response(String id, String name, String location, String principalName, List<Student> studentList) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.principalName = principalName;
        this.studentList = studentList;
    }
}
