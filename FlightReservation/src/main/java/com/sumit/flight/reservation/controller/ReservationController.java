package com.sumit.flight.reservation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sumit.flight.reservation.dto.ReservationRequest;
import com.sumit.flight.reservation.entities.Flight;
import com.sumit.flight.reservation.entities.Reservation;
import com.sumit.flight.reservation.service.FlightService;
import com.sumit.flight.reservation.service.ReservationService;

@Controller
public class ReservationController {

	@Autowired
	FlightService fservice;
	@Autowired
	ReservationService rservice;
	@RequestMapping("/showCompleteReservation")
	public String reservation(@RequestParam("flightId") int flightId, ModelMap map)
	{
		Flight flight=fservice.searchById(flightId);
		map.addAttribute("flight",flight);
		return "CompleteReservatoin";
	}
	
	@RequestMapping("/completeReservation")
	public String completeReservation(ReservationRequest request,ModelMap map)
	{
		Reservation reservation=rservice.bookTicket(request);
		map.addAttribute("msg", "Reservation is successfully created and the id is "+reservation.getId());
		return "reservationConfirmation";
	}
}
