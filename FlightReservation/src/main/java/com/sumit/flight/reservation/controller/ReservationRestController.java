package com.sumit.flight.reservation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sumit.flight.reservation.dto.ReservationUpdateRequest;
import com.sumit.flight.reservation.entities.Reservation;
import com.sumit.flight.reservation.entities.ReservationNotFound;
import com.sumit.flight.reservation.globalexception.ReservationCustomException;
import com.sumit.flight.reservation.service.ReservationService;

/*
 * Since we want to have interaction with micro services, So I have created Restful services as microservice communication
 * can be done only via restful web services.
 * As we have micro services named as flightcheckin, from micro service flightcheckin we will call this restful
 * services.
 * 
 * 
 */
@RestController
public class ReservationRestController {
	@Autowired
	ReservationService rservice;
	@GetMapping("/Reservations/{id}")
	public Reservation getReservation(@PathVariable("id") int id) 
	{
		Reservation reservation=rservice.searchReservation(id);
		if(reservation.getClass()==null)
		{
			System.out.println("HIIIIIIIIIIIIIIII");
			throw new ReservationCustomException("The mention reservation id not found "+ id);
		}
		return reservation;
		
		
	}
	@PutMapping("/Reservations")
	public Reservation updateReservation(@RequestBody ReservationUpdateRequest request)
	{
		System.out.println(request.getId()+" no of bag "+request.getNoOfBags()+" checkin status"+request.isCheckin());
		Reservation reservation=rservice.searchReservation(request.getId());
		System.out.println(request.getId()+" no of bag "+request.getNoOfBags()+" checkin status"+request.isCheckin());
		reservation.setNo_of_bags(request.getNoOfBags());
		reservation.setChk_in(request.isCheckin());
		return rservice.updateReservation(reservation);
		
	}
}
