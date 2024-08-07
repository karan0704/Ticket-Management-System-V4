package com.example.ticketapp.service;

import org.springframework.stereotype.Service;

@Service
public class AuthService {

    // This method should contain the actual authentication logic
    public boolean authenticate(LoginRequest loginRequest) {
        // Replace with actual authentication logic (e.g., database query)
        return "user@example.com".equals(loginRequest.getEmail()) && "password".equals(loginRequest.getPassword());
    }
}
