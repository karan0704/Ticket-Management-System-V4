// ticket.service.ts
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Ticket } from 'src/app/models/ticket';

@Injectable({
  providedIn: 'root'
})
export class TicketService {

  private baseUrl = 'http://localhost:8080/api/tickets'; 

  constructor(private http: HttpClient) { }

  // getAllTickets(): Observable<Ticket[]> {
  //   return this.http.get<Ticket[]>(`${this.baseUrl}`);
  // }

  getAllTickets(): Observable<Ticket[]> {
    return this.http.get<Ticket[]>(`${this.baseUrl}/tickets`);
  }
  
  

  // createTicket(ticket: Ticket): Observable<Ticket> {
  //   return this.http.post<Ticket>(`${this.baseUrl}`, ticket);
  // }

  getTicketById(id: number): Observable<Ticket> {
    return this.http.get<Ticket>(`${this.baseUrl}/${id}`);
  }

  createTicket(ticket: Ticket): Observable<Ticket> {
    return this.http.post<Ticket>(this.baseUrl, ticket);
  }

  // getAllTickets(): Observable<Ticket[]> {
  //   return this.http.get<Ticket[]>(this.baseUrl);
  // }

  // updateTicketStatus(id: number, newStatus: boolean): Observable<Ticket> {
  //   return this.http.put<Ticket>(`${this.baseUrl}/${id}/updateStatus?newStatus=${newStatus}`, {});
  // }
  // updateTicketStatus(id: number, newStatus: boolean): Observable<Ticket> {
  //   return this.http.put<Ticket>(`${this.baseUrl}/${id}/updateStatus`, {}, {
  //     params: { newStatus: newStatus.toString() }
  //   });
  // }
  
  
  // updateTicketStatus(id: number, newStatus: boolean): Observable<Ticket> {
  //   return this.http.put<Ticket>(`${this.baseUrl}/${id}/updateStatus`, {}, {
  //     params: { newStatus: newStatus.toString() }
  //   });
  // }
  
  // updateTicketStatus(id: number, newStatus: boolean): Observable<Ticket> {
  //   return this.http.put<Ticket>(`${this.baseUrl}/${id}/updateStatus`, null, { params: { newStatus: String(newStatus) } });
  //   //return this.http.put<Ticket>(`${this.baseUrl}/${id}/updateStatus?newStatus=${newStatus}`, null);
  // }

  updateTicketStatus(id: number, newStatus: boolean): Observable<Ticket> {
    return this.http.put<Ticket>(`${this.baseUrl}/${id}/updateStatus`, null, {
      params: { newStatus: Boolean(newStatus) }
    });
}



  deleteTicket(id: number): Observable<void> {
    return this.http.delete<void>(`${this.baseUrl}/${id}`);
  }
}
