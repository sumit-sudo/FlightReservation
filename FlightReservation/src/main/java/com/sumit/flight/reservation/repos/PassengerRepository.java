package com.sumit.flight.reservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sumit.flight.reservation.entities.Passenger;


public interface PassengerRepository extends JpaRepository< Passenger, Integer> {

}
