package com.example.ticketapp.model;

import com.example.ticketapp.util.RandomSixDigitNumberGenerator;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@ToString
@Entity
public class TicketEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String customerName; //User Input
    private int sixDigitTicketNumber;
    private String ticketTitle; //User Input
    private String ticketDescription; //User Input
    private Date preferredDAte;

    @ManyToOne
    private CustomerEntity customerEntity;

    @Enumerated(EnumType.STRING)
    private TicketStatus ticketStatus;

    public TicketEntity() {
        // Default constructor
    }

    //Parameterized Constructor
    public TicketEntity(String customerName, String ticketTitle, String ticketDescription, TicketStatus ticketStatus) {
        this.customerName = customerName;
        this.ticketTitle = ticketTitle;
        this.ticketDescription = ticketDescription;
        this.ticketStatus = ticketStatus;
        this.sixDigitTicketNumber = RandomSixDigitNumberGenerator.generateUniqueNumber();
    }
}
