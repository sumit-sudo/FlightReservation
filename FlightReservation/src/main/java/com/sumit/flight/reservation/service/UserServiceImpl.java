package com.sumit.flight.reservation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sumit.flight.reservation.entities.User;
import com.sumit.flight.reservation.repos.UserRepository;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository urepo;
	
	@Override
	public void addUser(User u) {
		
		System.out.println(urepo.save(u).toString());
		
		
	}

	@Override
	public User searchByEmail(String email) {
		
		return urepo.findByEmail(email);
	}

}
