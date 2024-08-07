import { Component } from '@angular/core';
import { TicketService } from 'src/app/services/ticket.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {
  loginData = { email: '', password: '' };

  constructor(private : ticketService: TicketService, private router: Router) {}

  onSubmit() {
    this.ticketService.login(this.loginData).subscribe(
      response => {
        if (response.success) {
          this.router.navigate(['/dashboard']);
        } else {
          alert('Login failed');
        }
      },
      error => {
        alert('An error occurred');
      }
    );
  }
}
