package com.sumit.flight.reservation.service;

import java.util.Date;
import java.util.List;

import com.sumit.flight.reservation.entities.Flight;


public interface FlightService {
	public List<Flight> findFlight(String from, String to, Date d);
	public Flight searchById(int id);
}
