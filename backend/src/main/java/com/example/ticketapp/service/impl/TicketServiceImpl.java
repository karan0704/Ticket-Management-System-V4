package com.example.ticketapp.service.impl;

import com.example.ticketapp.model.TicketEntity;
import com.example.ticketapp.model.TicketStatus;
import com.example.ticketapp.repository.TicketRepository;
import com.example.ticketapp.service.TicketService;
import com.example.ticketapp.util.RandomSixDigitNumberGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TicketServiceImpl implements TicketService {

    private final TicketRepository ticketRepository;

    //Constructor
    @Autowired
    public TicketServiceImpl(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

	
	@Override
	public List<TicketEntity> getAllTickets() {
	    return ticketRepository.findAll();
	}

    @Override
    public TicketEntity createTicket(TicketEntity ticket) {
        ticket.setSixDigitTicketNumber(RandomSixDigitNumberGenerator.generateUniqueNumber());
        return ticketRepository.save(ticket);
    }

    @Override
    public List<TicketEntity> getAllTicketsSortedByTicketTitle() {
        return ticketRepository.findAllByOrderByTicketTitleAsc();
    }

    @Override
    public List<TicketEntity> getAllTicketsSortedByCustomerName() {
        return ticketRepository.findAllByOrderByCustomerNameAsc();
    }

    @Override
    public TicketEntity getTicketById(Long id) {
        Optional<TicketEntity> ticketOptional = ticketRepository.findById(id);
        return ticketOptional.orElse(null);
    }

    @Override
    public TicketEntity updateTicketStatus(Long id, TicketStatus newStatus) {
        Optional<TicketEntity> ticketOptional = ticketRepository.findById(id);
        if(!ticketOptional.isPresent()) {
            return null;
        }
        TicketEntity ticket = ticketOptional.get();
        ticket.setTicketStatus(newStatus);
        return ticketRepository.save(ticket);

    }

    @Override
    public void deleteTicket(Long id) {
        ticketRepository.deleteById(id);
    }
}
