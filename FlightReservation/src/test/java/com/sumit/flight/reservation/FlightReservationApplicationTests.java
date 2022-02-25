package com.sumit.flight.reservation;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Column;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sumit.flight.reservation.entities.Flight;
import com.sumit.flight.reservation.entities.User;
import com.sumit.flight.reservation.repos.UserRepository;
import com.sumit.flight.reservation.service.FlightService;
import com.sumit.flight.reservation.service.UserService;



@SpringBootTest
class FlightReservationApplicationTests {


	
	@Test
	void addUser() throws ParseException {
		
//		String d="02-08-2021";
//	    SimpleDateFormat sdf = new SimpleDateFormat("08-02-2021 09:00:00");
//	    String DateToStoreInDataBase= sdf.format(new Date()); // java.util.Date
//	   // System.out.println(DateToStoreInDataBase);
//	    Timestamp ts = Timestamp.valueOf(DateToStoreInDataBase);
//		Flight f=new Flight();
//		f.setFnumber("f101");
//		f.setO_Airlines("AIR INDIA");
//		f.setD_City("KOLKATA");
//		f.setA_City("BANGLORE");
//		f.setD_date(new SimpleDateFormat("dd-MM-yyyy").parse(d));
//		f.setEst_dep_time(Timestamp.valueOf("09:00:00"));
//		hjvkhck
//		//u.setFirst_name("Mukesh").setLast_name("Mandal").setEmail("ems@gmail.com").setPassword("785");
//		fservice.addFlight(f);
	}

}
