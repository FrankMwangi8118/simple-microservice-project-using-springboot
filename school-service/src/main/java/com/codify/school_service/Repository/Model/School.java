package com.codify.school_service.Repository.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="school_tbl")
public class School {
    @Id
    private String id;
    private String name;
    private String location;
    private String principalName;
    @PrePersist
    void prePersist(){
        if (id==null){
            id= UUID.randomUUID().toString();
        }
    }

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
