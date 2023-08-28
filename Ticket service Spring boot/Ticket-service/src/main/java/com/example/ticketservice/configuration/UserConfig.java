package com.example.ticketservice.configuration;

import com.example.ticketservice.model.User;
import com.example.ticketservice.dao.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class UserConfig {
    @Bean
    CommandLineRunner commandLineRunner(
            UserRepository repository){
        return args -> {
                  User user1 =  new User(
                            "Francisco",
                            "Male",
                            "frank@gmail.com",
                            "Mexican",
                            "L46T589",
                            "Av San Juan. Guadalajara",
                            "33225566",
                            "4777TC6",
                            "Air France",
                            "New York NY",
                            "Paris France",
                            LocalDate.of(2023,11,07),
                            LocalDate.of(2023,11,12),
                            "12345678",
                            234678L,
                            "34FN56D7",
                            2000L,
                            500L,
                            "A",
                            "First Class",
                            LocalDate.of(2002,02,16)
                  );
            repository.saveAll(
                    List.of(user1)
            );
        };
    }
}
