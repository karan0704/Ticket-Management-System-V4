package com.example.ticketapp.service;

import com.example.ticketapp.model.TicketEntity;
import com.example.ticketapp.model.TicketStatus;

import java.util.List;

public interface TicketService {

    TicketEntity createTicket(TicketEntity ticket);

    List<TicketEntity> getAllTickets();
    

    List<TicketEntity> getAllTicketsSortedByTicketTitle();

    List<TicketEntity> getAllTicketsSortedByCustomerName();

    TicketEntity getTicketById(Long id);

    TicketEntity updateTicketStatus(Long id, TicketStatus newStatus);

    void deleteTicket(Long id);
}
