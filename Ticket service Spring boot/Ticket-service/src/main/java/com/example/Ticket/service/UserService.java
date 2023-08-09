package com.example.Ticket.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;
    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getUser() { //Rest endpoint
        return userRepository.findAll();
    }

    public void addNewUser(User user) {
        Optional<User>userByEmail = userRepository
                .findUserByEmail(user.getEmail());
        if (userByEmail.isPresent()) {
            throw new IllegalStateException("Email taken");
        }
        userRepository.save(user);
    }
    public void deleteUser(Long userPnr){
        boolean exists = userRepository.existsById(userPnr);
        if(!exists){
            throw new IllegalStateException(
                    "student with id " + userPnr + " does not exists ");
        }
        userRepository.deleteById(userPnr);
    }
}
