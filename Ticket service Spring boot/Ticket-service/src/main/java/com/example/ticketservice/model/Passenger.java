package com.example.ticketservice.model;

import jakarta.persistence.*;

@Entity
@Table
public class Passenger {
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
            name = "Address"

    )
    private String address;
    @Column(
            name = "Nationality"

    )
    private String nationality;
    @Column(
            name = "Full name"

    )
    private String name;
    @Column(
            name = "Gender"

    )
    private String gender;
    @Column(
            name = "Phone number"

    )
    private String phone;
    @Column(
            name = "Passport number"

    )
    private String passport_no;
    @Column(
            name = "Flight code"

    )
    private String flight_code;

    public Passenger() {
    }

    public Passenger(Long pnr_no,
                     String address,
                     String nationality,
                     String name,
                     String gender,
                     String phone,
                     String passport_no,
                     String flight_code) {
        this.pnr_no = pnr_no;
        this.address = address;
        this.nationality = nationality;
        this.name = name;
        this.gender = gender;
        this.phone = phone;
        this.passport_no = passport_no;
        this.flight_code = flight_code;
    }
    public Passenger(String address,
                     String nationality,
                     String name,
                     String gender,
                     String phone,
                     String passport_no,
                     String flight_code) {
        this.address = address;
        this.nationality = nationality;
        this.name = name;
        this.gender = gender;
        this.phone = phone;
        this.passport_no = passport_no;
        this.flight_code = flight_code;
    }

    public Long getPnr_no() {
        return pnr_no;
    }

    public void setPnr_no(Long pnr_no) {
        this.pnr_no = pnr_no;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassport_no() {
        return passport_no;
    }

    public void setPassport_no(String passport_no) {
        this.passport_no = passport_no;
    }

    public String getFlight_code() {
        return flight_code;
    }

    public void setFlight_code(String flight_code) {
        this.flight_code = flight_code;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "pnr_no=" + pnr_no +
                ", address='" + address + '\'' +
                ", nationality='" + nationality + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", phone='" + phone + '\'' +
                ", passport_no='" + passport_no + '\'' +
                ", flight_code='" + flight_code + '\'' +
                '}';
    }
}
