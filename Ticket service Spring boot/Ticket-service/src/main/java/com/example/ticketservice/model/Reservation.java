package com.example.ticketservice.model;


import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table
public class Reservation {
    @Id
    @SequenceGenerator(
            name = "user_sequence",
            sequenceName = "user_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "user_sequence"
    )
    @Column(
            name = "Pnr number"

    )
    private Long pnr_no;
    @Column(
            name = "Ticket id"

    )
    private Long ticket_id;
    @Column(
            name = "Flight code"

    )
    private String flight_code;
    @Column(
            name = "Departure"

    )
    private String departure;
    @Column(
            name = "Destination"

    )
    private String destination;
    @Column(
            name = "Departure date"

    )
    private LocalDate dep_date;
    @Column(
            name = "Departure time"

    )
    private LocalDate dep_time;

    public Reservation() {
    }

    public Reservation(String flight_code,
                       String departure,
                       String destination,
                       LocalDate dep_date,
                       LocalDate dep_time) {
        this.flight_code = flight_code;
        this.departure = departure;
        this.destination = destination;
        this.dep_date = dep_date;
        this.dep_time = dep_time;
    }

    public Long getPnr_no() {
        return pnr_no;
    }

    public void setPnr_no(Long pnr_no) {
        this.pnr_no = pnr_no;
    }

    public Long getTicket_id() {
        return ticket_id;
    }

    public void setTicket_id(Long ticket_id) {
        this.ticket_id = ticket_id;
    }

    public String getFlight_code() {
        return flight_code;
    }

    public void setFlight_code(String flight_code) {
        this.flight_code = flight_code;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public LocalDate getDep_date() {
        return dep_date;
    }

    public void setDep_date(LocalDate dep_date) {
        this.dep_date = dep_date;
    }

    public LocalDate getDep_time() {
        return dep_time;
    }

    public void setDep_time(LocalDate dep_time) {
        this.dep_time = dep_time;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "pnr_no=" + pnr_no +
                ", ticket_id=" + ticket_id +
                ", flight_code='" + flight_code + '\'' +
                ", departure='" + departure + '\'' +
                ", destination='" + destination + '\'' +
                ", dep_date=" + dep_date +
                ", dep_time=" + dep_time +
                '}';
    }
}
