import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Ticket } from 'src/app/models/ticket';
import { TicketService } from 'src/app/services/ticket.service';

@Component({
  selector: 'app-ticket-details',
  templateUrl: './ticket-details.component.html',
  styleUrls: ['./ticket-details.component.css']
})
export class TicketDetailsComponent implements OnInit {
  ticket: Ticket | undefined;

  constructor(
    private route: ActivatedRoute,
    private router: Router,
    private ticketService: TicketService
  ) {}

  ngOnInit(): void {
    this.getTicket();
  }

  getTicket(): void {
    const id = +this.route.snapshot.paramMap.get('id')!;
    this.ticketService.getTicketById(id).subscribe(ticket => this.ticket = ticket);
  }

  updateStatus(newStatus: boolean): void {
    if (this.ticket) {
      this.ticketService.updateTicketStatus(this.ticket.id, newStatus).subscribe(
        updatedTicket => this.ticket = updatedTicket
      );
    }
  }

  deleteTicket(): void {
    if (this.ticket) {
      this.ticketService.deleteTicket(this.ticket.id).subscribe(() => this.router.navigate(['/tickets']));
    }
  }
}