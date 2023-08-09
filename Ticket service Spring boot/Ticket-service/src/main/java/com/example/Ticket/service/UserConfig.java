package com.example.Ticket.service;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.time.LocalDate;
import java.time.Month;

@Configuration
public class UserConfig {
    @Bean
    CommandLineRunner commandLineRunner(
            UserRepository repository){
        return args -> {
            User mariam = new User(

            );
            User alex = new User(

            );

            repository.saveAll(
                    List.of(mariam,alex)
            );
        };
    }
}
