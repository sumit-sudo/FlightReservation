package com.sumit.flight.reservation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.sumit.flight.reservation.entities.User;
import com.sumit.flight.reservation.repos.UserRepository;

@Service
public class UserDetailServiceImpl implements UserDetailsService {

	@Autowired
	UserRepository urepo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user=urepo.findByEmail(username);
		return new org.springframework.security.core.userdetails.User(user.getEmail(),user.getPassword(),user.getRoles());
	}

}
