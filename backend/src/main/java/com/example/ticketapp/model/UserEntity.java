package com.example.ticketapp.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Inheritance(strategy = InheritanceType.JOINED)

public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String Name;
    private String Email;
    private String Password;

    @Enumerated(EnumType.STRING)
    private UserRoleEntity role;
}
