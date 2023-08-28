package com.example.ticketservice.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Login {
    @Column(
            name = "Email",
            updatable = false

    )
    private String email;
    @Column(
            name = "Password",
            updatable = false

    )
    private String password;

    public Login() {
    }

    public Login(String email,
                 String password) {
       this.email = email;
       this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Login{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
