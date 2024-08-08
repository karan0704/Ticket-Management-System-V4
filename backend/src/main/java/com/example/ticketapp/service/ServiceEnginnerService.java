package com.example.ticketapp.service;

import com.example.ticketapp.model.ServiceEngineerEntity;
import org.apache.catalina.User;

public interface ServiceEnginnerService extends UserService {
    ServiceEngineerEntity getServiceEngineerByExpertise(String expertise);
}
