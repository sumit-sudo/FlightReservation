package com.sumit.flight.reservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;


import com.sumit.flight.reservation.entities.Reservation;


public interface ReservationRepository extends JpaRepository< Reservation, Integer> {

}
