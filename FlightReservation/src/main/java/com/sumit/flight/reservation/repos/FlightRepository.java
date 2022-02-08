package com.sumit.flight.reservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sumit.flight.reservation.entities.Flight;


public interface FlightRepository extends JpaRepository< Flight, Integer> {

}
