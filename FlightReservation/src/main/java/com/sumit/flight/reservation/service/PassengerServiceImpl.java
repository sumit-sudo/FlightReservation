package com.sumit.flight.reservation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sumit.flight.reservation.dto.ReservationRequest;
import com.sumit.flight.reservation.entities.Flight;
import com.sumit.flight.reservation.entities.Passenger;
import com.sumit.flight.reservation.entities.Reservation;
import com.sumit.flight.reservation.repos.PassengerRepository;

@Service
public class PassengerServiceImpl implements PassengerService {

	@Autowired
	PassengerRepository prepo;
	@Override
	public Passenger getPassenger(int id) {
		// TODO Auto-generated method stub
		return prepo.findById(id).get();
	}
	@Override
	public Passenger savePassenger(Passenger p) {
		
		return prepo.save(p);
	}

}
