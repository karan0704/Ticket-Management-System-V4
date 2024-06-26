package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.ticketapp.model.TicketEntity;

@SpringBootApplication
public class TicketSystemV4Application {

	public static void main(String[] args) {
		SpringApplication.run(TicketSystemV4Application.class, args);
		
		TicketEntity ticketEntity =  new TicketEntity();
		System.out.println(ticketEntity);
	}

}
