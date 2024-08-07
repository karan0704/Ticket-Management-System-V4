package com.example.ticketapp.model;

import com.example.ticketapp.util.RandomSixDigitNumberGenerator;

import javax.persistence.*;
import java.util.Date;

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

    // Getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getSixDigitTicketNumber() {
        return sixDigitTicketNumber;
    }

    public void setSixDigitTicketNumber(int sixDigitTicketNumber) {
        this.sixDigitTicketNumber = sixDigitTicketNumber;
    }

    public String getTicketTitle() {
        return ticketTitle;
    }

    public void setTicketTitle(String ticketTitle) {
        this.ticketTitle = ticketTitle;
    }

    public String getTicketDescription() {
        return ticketDescription;
    }

    public void setTicketDescription(String ticketDescription) {
        this.ticketDescription = ticketDescription;
    }

    public TicketStatus isTicketStatus() {
        return ticketStatus;
    }

    public void setTicketStatus(TicketStatus ticketStatus) {
        this.ticketStatus = ticketStatus;
    }

    //ToString Method
    @Override
    public String toString() {
        return "TicketEntity{" +
                "id=" + id +
                ", customerName='" + customerName + '\'' +
                ", sixDigitTicketNumber=" + sixDigitTicketNumber +
                ", ticketTitle='" + ticketTitle + '\'' +
                ", ticketDescription='" + ticketDescription + '\'' +
                ", ticketStatus=" + ticketStatus +
                '}';
    }
    
    
    
}
