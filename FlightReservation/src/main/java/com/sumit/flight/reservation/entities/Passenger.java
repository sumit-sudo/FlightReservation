package com.sumit.flight.reservation.entities;

import javax.persistence.Column;
import javax.persistence.Entity;


@Entity
public class Passenger extends AbstractEntity{


	@Column(name="FIRST_NAME")
	private String fname;
	@Column(name="LAST_NAME")
	private String lname;
	@Column(name="MIDDLE_NAME")
	private String mname;
	@Column(name="EMAIL")
	private String email;
	@Column(name="PHONE")
	private String phone;


	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}
