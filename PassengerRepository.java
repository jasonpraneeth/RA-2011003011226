package com.example.trainmicroservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.trainmicroservice.model.Passenger;



@Repository
public interface PassengerRepository extends JpaRepository<Passenger, Integer> {

    // You can add custom query methods here if needed

}
