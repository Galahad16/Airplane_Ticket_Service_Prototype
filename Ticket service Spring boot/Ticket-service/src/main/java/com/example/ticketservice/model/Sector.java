package com.example.ticketservice.model;

import jakarta.persistence.Entity;

@Entity
public class Sector {
    private String flight_code;
    private Long capacity;
    private String class_code;
    private String class_name;

    public Sector() {
    }

    public Sector(String flight_code,
                  Long capacity,
                  String class_code,
                  String class_name) {
        this.flight_code = flight_code;
        this.capacity = capacity;
        this.class_code = class_code;
        this.class_name = class_name;
    }

    public String getFlight_code() {
        return flight_code;
    }

    public void setFlight_code(String flight_code) {
        this.flight_code = flight_code;
    }

    public Long getCapacity() {
        return capacity;
    }

    public void setCapacity(Long capacity) {
        this.capacity = capacity;
    }

    public String getClass_code() {
        return class_code;
    }

    public void setClass_code(String class_code) {
        this.class_code = class_code;
    }

    public String getClass_name() {
        return class_name;
    }

    public void setClass_name(String class_name) {
        this.class_name = class_name;
    }

    @Override
    public String toString() {
        return "Sector{" +
                "flight_code='" + flight_code + '\'' +
                ", capacity=" + capacity +
                ", class_code='" + class_code + '\'' +
                ", class_name='" + class_name + '\'' +
                '}';
    }
}
