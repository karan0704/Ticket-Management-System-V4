package com.example.ticketapp.model;

import com.example.ticketapp.util.RandomSixDigitNumberGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TicketEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String customerName; //User Input
    private int sixDigitTicketNumber;
    private String ticketTitle; //User Input
    private String ticketIssue; //User Input
    private boolean ticketStatus; // Updated field: true for open, false for closed

    public TicketEntity() {
        // Default constructor required by JPA
    }

    //Parameterized Constructor
    public TicketEntity(String customerName, String ticketTitle, String ticketIssue, boolean ticketStatus) {
        this.customerName = customerName;
        this.ticketTitle = ticketTitle;
        this.ticketIssue = ticketIssue;
        this.ticketStatus = ticketStatus;
        this.sixDigitTicketNumber = RandomSixDigitNumberGenerator.generateUniqueNumber();
    }

    // Getters and setters (omitted for brevity)

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

    public String getTicketIssue() {
        return ticketIssue;
    }

    public void setTicketIssue(String ticketIssue) {
        this.ticketIssue = ticketIssue;
    }

    public boolean isTicketStatus() {
        return ticketStatus;
    }

    public void setTicketStatus(boolean ticketStatus) {
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
                ", ticketIssue='" + ticketIssue + '\'' +
                ", ticketStatus=" + ticketStatus +
                '}';
    }
    
    
    
}
