package com.sumit.flight.reservation.entities;

import java.time.LocalDateTime;

public class ReservationNotFound {
	private int id;
	private String message;
	private LocalDateTime localtime;
	
	
	public ReservationNotFound(int id, String message, LocalDateTime localtime) {
		this.id = id;
		this.message = message;
		this.localtime = localtime;
	}
}
