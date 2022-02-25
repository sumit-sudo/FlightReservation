package com.sumit.flight.reservation.service;

import com.sumit.flight.reservation.entities.Passenger;

public interface PassengerService {

	public Passenger getPassenger(int id);
	public Passenger savePassenger(Passenger p);
}
