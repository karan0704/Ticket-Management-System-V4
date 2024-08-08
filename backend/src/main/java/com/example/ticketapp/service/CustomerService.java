package com.example.ticketapp.service;

import com.example.ticketapp.model.CustomerEntity;

public interface CustomerService extends UserService {
    CustomerEntity getCustomerByEmail(String email);
}
