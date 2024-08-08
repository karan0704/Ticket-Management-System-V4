package com.example.ticketapp.model;

import javax.persistence.Entity;

@Entity
public class ServiceEngineerEntity extends UserEntity {
    private String expertise;

    // Getters and setters-------------------------------
    public String getExpertise() {
        return expertise;
    }
    public void setExpertise(String expertise) {
        this.expertise = expertise;
    }
}
