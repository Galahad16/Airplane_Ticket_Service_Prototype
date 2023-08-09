package com.example.Ticket.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/user")
public class UserController {
    private final UserService userService;
    @Autowired
    public UserController(UserService userService) {

        this.userService = userService;
    }

    @GetMapping
    public List<User> getUser() { //Rest endpoint
        return userService.getUser();
    }
    @PostMapping
    public void registerNewUser(@RequestBody User user){
        userService.addNewUser(user);
    }
    @DeleteMapping(path = "{userPnr}")
    public void deleteStudent(@PathVariable("userPnr") Long userPnr){
        userService.deleteUser(userPnr);
    }
}
