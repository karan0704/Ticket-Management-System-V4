package com.example.ticketapp.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
@Setter
@Getter
@Entity
public class ServiceManagerEntity extends UserEntity {
    private String departmentName;
}
