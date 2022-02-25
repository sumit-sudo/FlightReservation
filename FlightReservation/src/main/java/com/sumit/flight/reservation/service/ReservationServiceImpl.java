package com.sumit.flight.reservation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sumit.flight.reservation.dto.ReservationRequest;
import com.sumit.flight.reservation.entities.Flight;
import com.sumit.flight.reservation.entities.Passenger;
import com.sumit.flight.reservation.entities.Reservation;
import com.sumit.flight.reservation.repos.ReservationRepository;

@Service
public class ReservationServiceImpl implements ReservationService {


	@Autowired
	FlightService fservice;
	
	@Autowired
	PassengerService pservice;
	
	@Autowired
	ReservationRepository re_repo;
	
	public Reservation bookTicket(ReservationRequest request)
	{
		//int cardnumber=request.getCardNumber();
		// Similarly we can take gather the card information and pass these details while calling 3rd person API
		
		// Since Reservation table has one to one relationship between flight and passenger
		Flight flight=fservice.searchById(request.getFlightId());
		
		Passenger passenger=new Passenger();
		passenger.setFname(request.getPassengerFirstName());
		passenger.setLname(request.getPassengerLastName());
		passenger.setEmail(request.getPassengerEmail());
		passenger.setPhone(request.getPassengerPhone());
		
		Passenger pass= pservice.savePassenger(passenger);
		
		Reservation reservation=new Reservation();
		reservation.setFid(flight);
		reservation.setChk_in(false);
		reservation.setPid(pass);
		
		Reservation res= re_repo.save(reservation);
		
		return res;
		
	}

	@Override
	public Reservation searchReservation(int id) {
		
		return re_repo.findById(id).orElse(null);
	}

	@Override
	public Reservation updateReservation(Reservation reservation) {
		
		return re_repo.save(reservation);
	}
}
