package com.example.ticketservice.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;


public class Flight {
    @Column(
            name = "Flight code"

    )
    private String flight_code;
    @Column(
            name = "Flight name"

    )
    private String flight_name;
    @Column(
            name = "Departure"

    )
    private String departure;
    @Column(
            name = "Destination"

    )
    private String destination;

    public Flight() {
    }

    public Flight(String flight_code,
                  String flight_name,
                  String departure,
                  String destination) {
        this.flight_code = flight_code;
        this.flight_name = flight_name;
        this.departure = departure;
        this.destination = destination;

    }

    public String getFlight_code() {
        return flight_code;
    }

    public void setFlight_code(String flight_code) {
        this.flight_code = flight_code;
    }

    public String getFlight_name() {
        return flight_name;
    }

    public void setFlight_name(String flight_name) {
        this.flight_name = flight_name;
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

    @Override
    public String toString() {
        return "Flight{" +
                "flight_code='" + flight_code + '\'' +
                ", flight_name='" + flight_name + '\'' +
                ", departure='" + departure + '\'' +
                ", destination='" + destination + '\'' +
                '}';
    }
}
