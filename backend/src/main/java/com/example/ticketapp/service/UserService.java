package com.example.ticketapp.service;

import com.example.ticketapp.model.UserEntity;

import java.util.List;

public interface UserService {
    UserEntity createUser(UserEntity user);
    UserEntity updateUser(UserEntity user);
    UserEntity getUserById(int id);
    List<UserEntity> getAllUsers();
    void deleteUser(int id);
}
