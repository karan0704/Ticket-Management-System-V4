package com.example.ticketapp.service.impl;

import com.example.ticketapp.model.CustomerEntity;
import com.example.ticketapp.model.UserEntity;
import com.example.ticketapp.service.CustomerService;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {
    /**
     * @param email
     * @return
     */
    @Override
    public CustomerEntity getCustomerByEmail(String email) {
        return null;
    }

    /**
     * @param user
     * @return
     */
    @Override
    public UserEntity createUser(UserEntity user) {
        return null;
    }

    /**
     * @param user
     * @return
     */
    @Override
    public UserEntity updateUser(UserEntity user) {
        return null;
    }

    /**
     * @param id
     * @return
     */
    @Override
    public UserEntity getUserById(int id) {
        return null;
    }

    /**
     * @return
     */
    @Override
    public List<UserEntity> getAllUsers() {
        return List.of();
    }

    /**
     * @param id
     */
    @Override
    public void deleteUser(int id) {

    }
}
