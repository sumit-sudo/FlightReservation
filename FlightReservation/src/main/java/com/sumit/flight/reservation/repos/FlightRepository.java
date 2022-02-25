package com.sumit.flight.reservation.repos;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sumit.flight.reservation.entities.Flight;

@Repository
public interface FlightRepository extends JpaRepository< Flight, Integer> {
	
	/*
	 * Below is the example of custom query
	 * Here, Left hand side, i.e DEPARTURE_CITY & ARRIVAL_CITY should match with field variable present 
	 * in Flight class.
	 */
	
	@Query("from Flight where DEPARTURE_CITY=:D_City and ARRIVAL_CITY=:A_City")
	List<Flight> searchFlight(@Param("D_City")String from,@Param("A_City") String to);

}
