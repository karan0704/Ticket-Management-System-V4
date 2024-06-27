package com.example.ticketapp.controller;

import com.example.ticketapp.model.TicketEntity;
import com.example.ticketapp.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tickets")
@CrossOrigin(origins = "http://localhost:4200")
public class TicketController {

	private final TicketService ticketService;

	@Autowired
	public TicketController(TicketService ticketService) {
		this.ticketService = ticketService;
	}

	@PostMapping
	public ResponseEntity<TicketEntity> createTicket(@RequestBody TicketEntity ticket) {
		TicketEntity createdTicket = ticketService.createTicket(ticket);
		return new ResponseEntity<>(createdTicket, HttpStatus.CREATED);
	}

	@GetMapping("/sortedByTicketTitle")
	public ResponseEntity<List<TicketEntity>> getAllTicketsSortedByTicketTitle() {
		List<TicketEntity> tickets = ticketService.getAllTicketsSortedByTicketTitle();
		return new ResponseEntity<>(tickets, HttpStatus.OK);
	}

	@GetMapping("/sortedByCustomerName")
	public ResponseEntity<List<TicketEntity>> getAllTicketsSortedByCustomerName() {
		List<TicketEntity> tickets = ticketService.getAllTicketsSortedByCustomerName();
		return new ResponseEntity<>(tickets, HttpStatus.OK);
	}

	@GetMapping("/tickets")
	public ResponseEntity<List<TicketEntity>> getAllTickets() {
		List<TicketEntity> tickets = ticketService.getAllTickets();
		return new ResponseEntity<>(tickets, HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<TicketEntity> getTicketById(@PathVariable("id") Long id) {
		TicketEntity ticket = ticketService.getTicketById(id);
		if (ticket != null) {
			return new ResponseEntity<>(ticket, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@PutMapping("/{id}/updateStatus")
	public ResponseEntity<TicketEntity> updateTicketStatus(@PathVariable Long id, @RequestParam String newStatus) {
		boolean status = Boolean.parseBoolean(newStatus);
		TicketEntity updatedTicket = ticketService.updateTicketStatus(id, status);
		if (updatedTicket != null) {
			return new ResponseEntity<>(updatedTicket, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	/*
	 * @PutMapping("/{id}/updateStatus") public ResponseEntity<TicketEntity>
	 * updateTicketStatus(@PathVariable Long id, @RequestParam boolean newStatus)
	 */

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteTicket(@PathVariable Long id) {
		ticketService.deleteTicket(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

}

/*
 * @GetMapping public ResponseEntity<List<TicketEntity>> getAllTickets() {
 * List<TicketEntity> tickets =
 * ticketService.getAllTicketsSortedByTicketTitle(); return new
 * ResponseEntity<>(tickets, HttpStatus.OK); }
 */