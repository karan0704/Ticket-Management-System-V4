import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { Ticket } from 'src/app/models/ticket';
import { TicketService } from 'src/app/services/ticket.service';

@Component({
  selector: 'app-create-ticket',
  templateUrl: './create-ticket.component.html',
  styleUrls: ['./create-ticket.component.css']
})
export class CreateTicketComponent {

  newTicket: Ticket = {
    id: 0,
    customerName: '',
    ticketTitle: '',
    ticketIssue: '',
    sixDigitTicketNumber: 0,
    ticketStatus: false,
  };

  constructor(
    private ticketService: TicketService,
    private router: Router
  ) { }

  createTicket(): void {
    this.ticketService.createTicket(this.newTicket).subscribe(
      () => {
        console.log('Ticket created successfully:'
          );
        this.router.navigate(['/tickets']);
      },
      (error: any) => {
        console.error('Error creating ticket:', error);
      }
    );
  }
}