package com.example.ticketapp.service;

import com.example.ticketapp.model.ServiceManagerEntity;

public interface ServiceManagerService {
    ServiceManagerEntity getServiceManagerEntityByDepartment(String department);
}
