package com.example.trainmicroservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.trainmicroservice.model.Passenger;
import com.example.trainmicroservice.repository.PassengerRepository;

@RestController
public class MyController {
    
    @Autowired
    private PassengerRepository EmployeeRepository;

    @GetMapping("/train")
    public List<Passenger> getAllEmployees() {
        return EmployeeRepository.findAll();
    }
 
    @GetMapping("/ticket")
    public String home() {
        return "This is train ticket.";
    }
}
