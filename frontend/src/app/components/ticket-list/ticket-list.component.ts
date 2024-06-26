import { Component, OnInit } from '@angular/core';
import { Ticket } from 'src/app/models/ticket';
import { TicketService } from 'src/app/services/ticket.service';
import { HttpErrorResponse } from '@angular/common/http';


@Component({
  selector: 'app-ticket-list',
  templateUrl: './ticket-list.component.html',
  styleUrls: ['./ticket-list.component.css']
})
export class TicketListComponent implements OnInit {

  tickets: Ticket[] = [];

  constructor(private ticketService: TicketService) {}

  ngOnInit(): void {
    this.loadTickets();
  }

  // loadTickets(): void {
  //   this.ticketService.getAllTickets().subscribe(
  //     tickets => {
  //       this.tickets = tickets;
  //     },
  //     error => {
  //       console.error('Error loading tickets:', error);
  //     }
  //   );
  // }
  loadTickets(): void {
    this.ticketService.getAllTickets().subscribe(
      (tickets: Ticket[]) => {
        this.tickets = tickets;
      },
      (error: HttpErrorResponse) => {
        console.error('Error loading tickets:', error);
        this.showErrorNotification(error.message);
      }
    );
  }



  
  private showErrorNotification(errorMessage: string): void {
    // Implement your notification logic here
    console.error(errorMessage);
  }


  

  deleteTicket(ticketId: number): void {
    if (confirm('Are you sure you want to delete this ticket?')) {
      this.ticketService.deleteTicket(ticketId).subscribe(
        () => {
          console.log('Ticket deleted successfully');
          this.loadTickets(); // Reload tickets after deletion
        },
        error => {
          console.error('Error deleting ticket:', error);
        }
      );
    }
  }

  changeTicketStatus(ticketId: number, newStatus: boolean): void {
    this.ticketService.updateTicketStatus(ticketId, newStatus).subscribe(
      () => {
        console.log('Ticket status updated successfully');
        this.loadTickets(); // Reload tickets to refresh the view
      },
      error => {
        console.error('Error updating ticket status:', error);
      }
    );
  }
}
