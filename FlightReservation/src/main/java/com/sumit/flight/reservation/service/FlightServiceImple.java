/**
 * 
 */
package com.sumit.flight.reservation.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sumit.flight.reservation.entities.Flight;
import com.sumit.flight.reservation.repos.FlightRepository;

@Service
public class FlightServiceImple implements FlightService {

	@Autowired
	FlightRepository frepo;
	


	@Override
	public List<Flight> findFlight(String from, String to, Date date) {
		
		return frepo.searchFlight( from,  to);
	}



	@Override
	public Flight searchById(int id) {
		/*
		 * findOne(id) and findById(id)
		 * The main difference between is, we don't have to use .get after findOne(); we use .get as return type
		 * is Optional<ClassName>
		 */
		return frepo.findById(id).get();
	}




}
