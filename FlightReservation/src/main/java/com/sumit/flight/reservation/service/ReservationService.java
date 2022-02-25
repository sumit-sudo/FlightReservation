package com.sumit.flight.reservation.service;

import com.sumit.flight.reservation.dto.ReservationRequest;
import com.sumit.flight.reservation.entities.Reservation;

public interface ReservationService {
	public Reservation bookTicket(ReservationRequest request);

	public Reservation searchReservation(int id);

	public Reservation updateReservation(Reservation reservation);
}
