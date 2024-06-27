import { Component, OnInit } from '@angular/core';
import { TicketService } from 'src/app/services/ticket.service';
import { Ticket } from 'src/app/models/ticket';

@Component({
  selector: 'app-ticket-list',
  templateUrl: './ticket-list.component.html',
  styleUrls: ['./ticket-list.component.css']
})
export class TicketListComponent implements OnInit {
  tickets: Ticket[] = [];
  searchTerm: number = 0;

  constructor(private ticketService: TicketService) {}

  ngOnInit(): void {
    this.loadAllTickets();
  }

  loadAllTickets(): void {
    this.ticketService.getAllTickets().subscribe((tickets) => {
      this.tickets = tickets;
    });
  }

  searchTickets(): void {
    if (this.searchTerm) {
      this.ticketService.getTicketById(this.searchTerm).subscribe((ticket) => {
        this.tickets = ticket ? [ticket] : [];
      });
    } else {
      this.loadAllTickets();
    }
  }

  sortByCustomerName(): void {
    this.ticketService.getAllTicketsSortedByCustomerName().subscribe((tickets) => {
      this.tickets = tickets;
    });
  }

  sortByTicketTitle(): void {
    this.ticketService.getAllTicketsSortedByTicketTitle().subscribe((tickets) => {
      this.tickets = tickets;
    });
  }

  deleteTicket(id: number): void {
    this.ticketService.deleteTicket(id).subscribe(() => {
      this.loadAllTickets();
    });
  }

  changeTicketStatus(id: number, newStatus: boolean): void {
    this.ticketService.updateTicketStatus(id, newStatus).subscribe(() => {
      this.loadAllTickets();
    });
  }
}
