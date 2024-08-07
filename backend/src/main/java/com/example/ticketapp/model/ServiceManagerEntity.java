package com.example.ticketapp.model;

import javax.persistence.Entity;

@Entity
public class ServiceManagerEntity extends UserEntity {
    private String departmentName;

    // Getters and setters
    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}
