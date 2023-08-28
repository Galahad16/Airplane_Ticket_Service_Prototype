package com.example.ticketservice.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table
public class Cancellation {
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
    private String pnr_no;
    @Column(
            name = "Cancellation number"

    )
    private String cancellation_no;
    @Column(
            name = "Cancellation date"

    )
    private LocalDate cancellation_date;
    @Column(
            name = "Flight code"

    )
    private String flight_code;

    public Cancellation() {
    }

    public Cancellation(String cancellation_no,
                        LocalDate cancellation_date,
                        String flight_code) {
        this.cancellation_no = cancellation_no;
        this.cancellation_date = cancellation_date;
        this.flight_code = flight_code;
    }

    public Cancellation(String pnr_no,
                        String cancellation_no,
                        LocalDate cancellation_date,
                        String flight_code) {
        this.pnr_no = pnr_no;
        this.cancellation_no = cancellation_no;
        this.cancellation_date = cancellation_date;
        this.flight_code = flight_code;
    }

    public String getPnr_no() {
        return pnr_no;
    }

    public void setPnr_no(String pnr_no) {
        this.pnr_no = pnr_no;
    }

    public String getCancellation_no() {
        return cancellation_no;
    }

    public void setCancellation_no(String cancellation_no) {
        this.cancellation_no = cancellation_no;
    }

    public LocalDate getCancellation_date() {
        return cancellation_date;
    }

    public void setCancellation_date(LocalDate cancellation_date) {
        this.cancellation_date = cancellation_date;
    }

    public String getFlight_code() {
        return flight_code;
    }

    public void setFlight_code(String flight_code) {
        this.flight_code = flight_code;
    }

    @Override
    public String toString() {
        return "Cancellation{" +
                "pnr_no='" + pnr_no + '\'' +
                ", cancellation_no='" + cancellation_no + '\'' +
                ", cancellation_date=" + cancellation_date +
                ", flight_code='" + flight_code + '\'' +
                '}';
    }
}
