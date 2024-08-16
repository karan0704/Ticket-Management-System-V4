package com.example.ticketapp.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
@Getter
@Setter
@Entity
public class ServiceEngineerEntity extends UserEntity {
    private String expertise;
}
