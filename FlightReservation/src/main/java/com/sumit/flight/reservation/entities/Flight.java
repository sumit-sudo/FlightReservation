package com.sumit.flight.reservation.entities;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;


@Entity
public class Flight extends AbstractEntity{

	@Column(name="FLIGHT_NUMBER")
	private String FLIGHT_NUMBER;
	@Column(name="OPERATING_AIRLINES")
	private String OPERATING_AIRLINES;
	@Column(name="DEPARTURE_CITY")
	private String DEPARTURE_CITY;
	@Column(name="ARRIVAL_CITY")
	private String ARRIVAL_CITY;
	@DateTimeFormat(pattern="dd-MM-yyyy")
	@Temporal(TemporalType.DATE)
	@Column(name="DATE_OF_DEPARTURE")
	private Date DATE_OF_DEPARTURE;
	@Column(name="ESTIMATED_DEPARTURE_TIME")
	private Timestamp ESTIMATED_DEPARTURE_TIME;
	public String getFLIGHT_NUMBER() {
		return FLIGHT_NUMBER;
	}
	public void setFLIGHT_NUMBER(String fLIGHT_NUMBER) {
		FLIGHT_NUMBER = fLIGHT_NUMBER;
	}
	public String getOPERATING_AIRLINES() {
		return OPERATING_AIRLINES;
	}
	public void setOPERATING_AIRLINES(String oPERATING_AIRLINES) {
		OPERATING_AIRLINES = oPERATING_AIRLINES;
	}
	public String getDEPARTURE_CITY() {
		return DEPARTURE_CITY;
	}
	public void setDEPARTURE_CITY(String dEPARTURE_CITY) {
		DEPARTURE_CITY = dEPARTURE_CITY;
	}
	public String getARRIVAL_CITY() {
		return ARRIVAL_CITY;
	}
	public void setARRIVAL_CITY(String aRRIVAL_CITY) {
		ARRIVAL_CITY = aRRIVAL_CITY;
	}
	public Date getDATE_OF_DEPARTURE() {
		return DATE_OF_DEPARTURE;
	}
	public void setDATE_OF_DEPARTURE(Date dATE_OF_DEPARTURE) {
		DATE_OF_DEPARTURE = dATE_OF_DEPARTURE;
	}
	public Timestamp getESTIMATED_DEPARTURE_TIME() {
		return ESTIMATED_DEPARTURE_TIME;
	}
	public void setESTIMATED_DEPARTURE_TIME(Timestamp eSTIMATED_DEPARTURE_TIME) {
		ESTIMATED_DEPARTURE_TIME = eSTIMATED_DEPARTURE_TIME;
	}

	
	
	
}
