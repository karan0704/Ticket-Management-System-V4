package com.example.ticketapp.service.impl;

import com.example.ticketapp.model.ServiceEngineerEntity;
import com.example.ticketapp.model.UserEntity;
import com.example.ticketapp.service.ServiceEnginnerService;

import java.util.List;

public class ServiceEnginnerServiceImpl implements ServiceEnginnerService {
    @Override
    public ServiceEngineerEntity getServiceEngineerByExpertise(String expertise) {
        return null;
    }

    @Override
    public UserEntity createUser(UserEntity user) {
        return null;
    }

    @Override
    public UserEntity updateUser(UserEntity user) {
        return null;
    }

    @Override
    public UserEntity getUserById(int id) {
        return null;
    }

    @Override
    public List<UserEntity> getAllUsers() {
        return List.of();
    }

    @Override
    public void deleteUser(int id) {

    }
}
