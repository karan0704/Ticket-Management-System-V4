// // ticket.service.ts
// import { Injectable } from '@angular/core';
// import { HttpClient } from '@angular/common/http';
// import { Observable } from 'rxjs';
// import { Ticket } from 'src/app/models/ticket';

// @Injectable({
//   providedIn: 'root'
// })
// export class TicketService {

//   private baseUrl = 'http://localhost:8080/api/tickets'; 

//   constructor(private http: HttpClient) { }

//   // getAllTickets(): Observable<Ticket[]> {
//   //   return this.http.get<Ticket[]>(`${this.baseUrl}`);
//   // }

//   getAllTickets(): Observable<Ticket[]> {
//     return this.http.get<Ticket[]>(`${this.baseUrl}/tickets`);
//   }
  
  

 

//   getTicketById(id: number): Observable<Ticket> {
//     return this.http.get<Ticket>(`${this.baseUrl}/${id}`);
//   }

//   createTicket(ticket: Ticket): Observable<Ticket> {
//     return this.http.post<Ticket>(this.baseUrl, ticket);
//   }

  
//   updateTicketStatus(id: number, newStatus: boolean): Observable<Ticket> {
//     return this.http.put<Ticket>(`${this.baseUrl}/${id}/updateStatus`, null, {
//       params: { newStatus: Boolean(newStatus) }
//     });
// }



//   deleteTicket(id: number): Observable<void> {
//     return this.http.delete<void>(`${this.baseUrl}/${id}`);
//   }
// }
import { Injectable } from '@angular/core';
import { HttpClient, HttpParams } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Ticket } from 'src/app/models/ticket';

@Injectable({
  providedIn: 'root'
})
export class TicketService {

  private baseUrl = 'http://localhost:8080/api/tickets';

  constructor(private http: HttpClient) { }

  getAllTickets(): Observable<Ticket[]> {
    return this.http.get<Ticket[]>(`${this.baseUrl}/tickets`);
  }

  getTicketById(id: number): Observable<Ticket> {
    return this.http.get<Ticket>(`${this.baseUrl}/${id}`);
  }

  createTicket(ticket: Ticket): Observable<Ticket> {
    return this.http.post<Ticket>(this.baseUrl, ticket);
  }

  updateTicketStatus(id: number, newStatus: boolean): Observable<Ticket> {
    const params = new HttpParams().set('newStatus', newStatus.toString());
    return this.http.put<Ticket>(`${this.baseUrl}/${id}/updateStatus`, null, { params });
  }

  deleteTicket(id: number): Observable<void> {
    return this.http.delete<void>(`${this.baseUrl}/${id}`);
  }

  getAllTicketsSortedByCustomerName(): Observable<Ticket[]> {
    return this.http.get<Ticket[]>(`${this.baseUrl}/tickets/sortedByCustomerName`);
  }

  getAllTicketsSortedByTicketTitle(): Observable<Ticket[]> {
    return this.http.get<Ticket[]>(`${this.baseUrl}/tickets/sortedByTicketTitle`);
  }
}
