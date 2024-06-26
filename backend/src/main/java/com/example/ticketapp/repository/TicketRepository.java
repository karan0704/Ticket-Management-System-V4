package com.example.ticketapp.repository;

import com.example.ticketapp.model.TicketEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TicketRepository extends JpaRepository<TicketEntity, Long> {

    Optional<TicketEntity> findByTicketTitle(String ticketTitle);

    Optional<TicketEntity> findById(Long id);

    List<TicketEntity> findAllByOrderByTicketTitleAsc();

    List<TicketEntity> findAllByOrderByCustomerNameAsc();

    void deleteById(Long id);
}
