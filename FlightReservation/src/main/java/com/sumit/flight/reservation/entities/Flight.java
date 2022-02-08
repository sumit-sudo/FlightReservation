package com.sumit.flight.reservation.entities;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;


@Entity
public class Flight extends AbstractEntity{

	@Column(name="FLIGHT_NUMBER")
	private String fnumber;
	@Column(name="OPERATING_AIRLINES")
	private String O_Airlines;
	@Column(name="DEPARTURE_CITY")
	private String D_City;
	@Column(name="ARRIVAL_CITY")
	private String A_City;
	@Column(name="DATE_OF_DEPARTURE")
	private Date d_date;
	@Column(name="ESTIMATED_DEPARTURE_TIME")
	private Timestamp est_dep_time;

	public String getFnumber() {
		return fnumber;
	}
	public void setFnumber(String fnumber) {
		this.fnumber = fnumber;
	}
	public String getO_Airlines() {
		return O_Airlines;
	}
	public void setO_Airlines(String o_Airlines) {
		O_Airlines = o_Airlines;
	}
	public String getD_City() {
		return D_City;
	}
	public void setD_City(String d_City) {
		D_City = d_City;
	}
	public String getA_City() {
		return A_City;
	}
	public void setA_City(String a_City) {
		A_City = a_City;
	}
	public Date getD_date() {
		return d_date;
	}
	public void setD_date(Date d_date) {
		this.d_date = d_date;
	}
	public Timestamp getEst_dep_time() {
		return est_dep_time;
	}
	public void setEst_dep_time(Timestamp est_dep_time) {
		this.est_dep_time = est_dep_time;
	}
	
	
	
}
