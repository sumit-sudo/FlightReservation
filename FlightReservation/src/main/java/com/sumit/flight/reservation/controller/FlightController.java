package com.sumit.flight.reservation.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sumit.flight.reservation.entities.Flight;
import com.sumit.flight.reservation.service.FlightService;

@Controller
public class FlightController {
	    @Autowired
	    private FlightService fservice;
	
		//Note:
		// @DateTimeFormat(pattern="dd-MM-yyyy") - Spring will automatically convert into format dd-MM-yyyy form, whatever value we passs
		@RequestMapping("/findFlights")
		public String findFlight(@RequestParam("from")String from, @RequestParam("to") String to,
									@RequestParam("departureDate")@DateTimeFormat(pattern="dd-MM-yyyy") Date date, ModelMap map)
		{
			List<Flight> flights=fservice.findFlight(from,to,date);
			map.addAttribute("flights",flights );
			flights.forEach(s->System.out.println(s.getFLIGHT_NUMBER()+" "+s.getOPERATING_AIRLINES()));
			return "displayFlight";
		}
		@RequestMapping("admin/showAddFlight")
		public String showAddFlight() {
			return "addFlight";
		}
		

}
