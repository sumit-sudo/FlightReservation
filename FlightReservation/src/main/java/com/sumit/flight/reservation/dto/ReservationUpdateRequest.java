package com.sumit.flight.reservation.dto;

public class ReservationUpdateRequest {

	private int id;
	private int NoOfBags;
	private boolean checkin;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNoOfBags() {
		return NoOfBags;
	}
	public void setNoOfBags(int noOfBags) {
		NoOfBags = noOfBags;
	}
	public boolean isCheckin() {
		return checkin;
	}
	public void setCheckin(boolean checkin) {
		this.checkin = checkin;
	}
	
}
