package com.sumit.flight.reservation.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Reservation extends AbstractEntity{

	@Column(name="CHECKED_IN")
	private boolean chk_in;
	@Column(name="NUMBER_OF_BAGS")
	private int no_of_bags;
	@OneToOne
	@JoinColumn(name="PASSENGER_ID")
	private Passenger pid;
	@OneToOne
	@JoinColumn(name="FLIGHT_ID")
	private Flight fid;
	//private Timestamp created; we will use default time stamp from database

	public boolean isChk_in() {
		return chk_in;
	}
	public void setChk_in(boolean chk_in) {
		this.chk_in = chk_in;
	}
	public int getNo_of_bags() {
		return no_of_bags;
	}
	public void setNo_of_bags(int no_of_bags) {
		this.no_of_bags = no_of_bags;
	}
	public Passenger getPid() {
		return pid;
	}
	public void setPid(Passenger pid) {
		this.pid = pid;
	}
	public Flight getFid() {
		return fid;
	}
	public void setFid(Flight fid) {
		this.fid = fid;
	}
	
}
