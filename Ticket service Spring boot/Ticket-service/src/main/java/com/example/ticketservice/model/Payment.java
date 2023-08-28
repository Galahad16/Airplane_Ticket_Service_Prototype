package com.example.ticketservice.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Payment {
    @Column(
            name = "pnr number"

    )
    private Long pnr_no;
    @Column(
            name = "Phone number"

    )
    private String phone;
    @Column(
            name = "Card number"

    )
    private String card_no;
    @Column(
            name = "Paid amount"

    )
    private Long paid_amt;
    @Column(
            name = "Paid date"

    )
    private Long pay_date;

    public Payment() {
    }

    public Payment(String phone,
                   String card_no,
                   Long paid_amt,
                   Long pay_date) {
        this.phone = phone;
        this.card_no = card_no;
        this.paid_amt = paid_amt;
        this.pay_date =pay_date;
    }

    public Payment(Long pnr_no,
                   String phone,
                   String card_no,
                   Long paid_amt,
                   Long pay_date) {
        this.pnr_no = pnr_no;
        this.phone = phone;
        this.card_no = card_no;
        this.paid_amt = paid_amt;
        this.pay_date =pay_date;
    }

    public Long getPnr_no() {
        return pnr_no;
    }

    public void setPnr_no(Long pnr_no) {
        this.pnr_no = pnr_no;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCard_no() {
        return card_no;
    }

    public void setCard_no(String card_no) {
        this.card_no = card_no;
    }

    public Long getPaid_amt() {
        return paid_amt;
    }

    public void setPaid_amt(Long paid_amt) {
        this.paid_amt = paid_amt;
    }

    public Long getPay_date() {
        return pay_date;
    }

    public void setPay_date(Long pay_date) {
        this.pay_date = pay_date;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "pnr_no=" + pnr_no +
                ", phone='" + phone + '\'' +
                ", card_no='" + card_no + '\'' +
                ", paid_amt=" + paid_amt +
                ", pay_date=" + pay_date +
                '}';
    }
}
