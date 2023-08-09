package com.example.Ticket.service;
import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.Period;
@Entity
@Table
public class User {
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
    private Long pnr_no;
    private String name;
    private String gender;
    private String email;
    private LocalDate dob;
    private String nationality;
    private String  passport_no;
    private String address;
    private String phone;
    private String flight_code;
    private String flight_name;
    private String departure;
    private String destination;
    private String dep_date;
    private String dep_time;
    private String password;
    private Long cheque_no;
    private Long card_no;
    private Long paid_amt;
    private Long capacity;
    private String class_code;
    private String class_name;


    @Transient
    private Integer age;

    public User(){
    }

    public User(Long pnr_no,
                String name,
                String gender,
                String email,
                String nationality,
                String passport_no,
                String address,
                String phone,
                String flight_code,
                String flight_name,
                String departure,
                String destination,
                String dep_date,
                String dep_time,
                String password,
                Long cheque_no,
                Long card_no,
                Long paid_amt,
                Long capacity,
                String class_code,
                String class_name,
                LocalDate dob
                ) {
        this.pnr_no = pnr_no;
        this.name = name;
        this.gender = gender;
        this.email = email;
        this.nationality = nationality;
        this.passport_no = passport_no;
        this.address = address;
        this.phone = phone;
        this.flight_code = flight_code;
        this.flight_name = flight_name;
        this.departure = departure;
        this.destination = destination;
        this.dep_date = dep_date;
        this.dep_time = dep_time;
        this.password = password;
        this.cheque_no = cheque_no;
        this.card_no = card_no;
        this.paid_amt = paid_amt;
        this.capacity = capacity;
        this.class_code = class_code;
        this.class_name = class_name;
        this.dob = dob;

    }

    public User(String name,
                String gender,
                String email,
                String nationality,
                String passport_no,
                String address,
                String phone,
                String flight_code,
                String flight_name,
                String departure,
                String destination,
                String dep_date,
                String dep_time,
                String password,
                Long cheque_no,
                Long card_no,
                Long paid_amt,
                Long capacity,
                String class_code,
                String class_name,
                LocalDate dob
               ) {
        this.name = name;
        this.gender = gender;
        this.email = email;
        this.nationality = nationality;
        this.passport_no = passport_no;
        this.address = address;
        this.phone = phone;
        this.flight_code = flight_code;
        this.flight_name = flight_name;
        this.departure = departure;
        this.destination = destination;
        this.dep_date = dep_date;
        this.dep_time = dep_time;
        this.password = password;
        this.cheque_no = cheque_no;
        this.card_no = card_no;
        this.paid_amt = paid_amt;
        this.capacity = capacity;
        this.class_code = class_code;
        this.class_name = class_name;
        this.dob = dob;

    }

    //getters and setters
    public Long getPnr_no() {
        return pnr_no;
    }

    public void setPnr_no(Long pnr_no) {
        this.pnr_no = pnr_no;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNationality(){
        return nationality;
    }

    public void setNationality(String nationality){
        this.nationality = nationality;
    }

    public String getPassport_no(){
        return passport_no;
    }

    public void setPassport_no(String passport_no){
        this.passport_no = passport_no;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String address){ this.address = address; }

    public String getPhone() { return phone; }

    public void setPhone(String phone) { this.phone = phone; }

    public String getFlight_code(){
        return flight_code;
    }

    public void setFlight_code(String flight_code){
        this.flight_code = flight_code;
    }

    public String getFlight_name(){ return flight_name; }

    public void setFlight_name(String flight_name){
        this.flight_name = flight_name;
    }

    public String getDeparture(){ return departure; }

    public void setDeparture(String departure){
        this.departure = departure;
    }

    public String getDestination(){ return destination; }

    public void setDestination(String destination){
        this.destination = destination;
    }

    public String getDep_date(){ return dep_date; }

    public void setDep_date(String dep_date){
        this.dep_date = dep_date;
    }
    public String getDep_time(){ return dep_time; }

    public void setDep_time(String dep_time){
        this.dep_time = dep_time;
    }

    public String getPassword(){ return password; }

    public void setPassword(String password){
        this.password = password;
    }

    public Long getCheque_no(){ return cheque_no; }

    public void setCheque_no(Long cheque_no){
        this.cheque_no = cheque_no;
    }

    public Long getCard_no(){ return card_no; }

    public void setCard_no(Long card_no){
        this.card_no = card_no;
    }

    public Long getPaid_amt(){ return paid_amt; }

    public void setPaid_amt(Long paid_amt){
        this.paid_amt = paid_amt;
    }

    public Long getCapacity(){ return capacity; }

    public void setCapacity(Long capacity){
        this.paid_amt = capacity;
    }

    public String getClass_code(){ return class_code; }

    public void setClass_code(String class_code){
        this.class_code = class_code;
    }

    public String getClass_name(){ return class_name; }

    public void setClass_name(String class_name){
        this.class_name = class_name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Integer getAge() {
        return Period.between(this.dob, LocalDate.now()).getYears();
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "pnr_no=" + pnr_no +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", email='" + email + '\'' +
                ", nationality='" + nationality + '\'' +
                ", passport_no='" + passport_no + '\'' +
                ", address='" + address + '\'' +
                ", ph_o=" + phone +
                ", flight_code='" + flight_code + '\'' +
                ", flight_name='" + flight_name + '\'' +
                ", departure='" + departure + '\'' +
                ", destination='" + destination + '\'' +
                ", dep_date='" + dep_date + '\'' +
                ", dep_time='" + dep_time + '\'' +
                ", password='" + password + '\'' +
                ", cheque_no=" + cheque_no +
                ", card_no=" + card_no +
                ", paid_amt=" + paid_amt +
                ", capacity=" + capacity +
                ", class code='" + class_code + '\'' +
                ", class name='" + class_name + '\'' +
                ", dob=" + dob +
                ", age=" + age +
                '}';
    }
}
