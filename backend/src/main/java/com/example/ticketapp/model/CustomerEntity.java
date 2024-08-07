package com.example.ticketapp.model;

import javax.persistence.Entity;

@Entity
public class CustomerEntity extends UserEntity {
    private String companyName;

    // Getters and setters

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
