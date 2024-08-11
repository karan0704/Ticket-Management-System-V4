package com.example.ticketapp.repository;

import com.example.ticketapp.model.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository <CustomerEntity, Long> {
}
