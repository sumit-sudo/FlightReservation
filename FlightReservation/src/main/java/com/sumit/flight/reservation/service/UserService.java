package com.sumit.flight.reservation.service;

import com.sumit.flight.reservation.entities.User;

public interface UserService {
	
	public void addUser(User u);
	public User searchByEmail(String email);

}
