package com.example.ticketapp.service;

import com.example.ticketapp.model.TicketEntity;

import java.util.List;

public interface TicketService {

    TicketEntity createTicket(TicketEntity ticket);
    
    List<TicketEntity> getAllTickets();
    

    List<TicketEntity> getAllTicketsSortedByTicketTitle();

    List<TicketEntity> getAllTicketsSortedByCustomerName();

    TicketEntity getTicketById(Long id);

    TicketEntity updateTicketStatus(Long id, boolean newStatus);

    void deleteTicket(Long id);
}
