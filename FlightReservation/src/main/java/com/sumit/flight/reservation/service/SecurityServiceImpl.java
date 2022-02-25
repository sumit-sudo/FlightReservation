package com.sumit.flight.reservation.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;



public class SecurityServiceImpl implements  SecurityService{

	/* We call login method inside SecurityServiceImpl class by passing username and password.
	 * We use two interface for security (1) UserDetailsService (2)GrantedAuthority
	 * Basically we call loadUserByUsername from UserDetailsService which help in 
	 * getting credential from database and with the help of GrantedAuthority we extract role as well.
	 * 
	 * Here, we have used UsernamePasswordAuthenticationToken where we compare credentials with value retrieve from 
	 * loadUserByUsername from UserDetailsService with value (password) passed through method and we get one token 
	 * and and then we verify that token using AuthenticationManager.
	 * 
	 * 
	 */
	@Autowired
	UserDetailsService userdetailservice;
	
	@Autowired
	AuthenticationManager authenticationmanager;
	
	@Override
	public boolean login(String username,String password) {
		
		UserDetails userdetail=userdetailservice.loadUserByUsername(username);
		
		UsernamePasswordAuthenticationToken token=new UsernamePasswordAuthenticationToken(userdetail, password,userdetail.getAuthorities());
		authenticationmanager.authenticate(token);
		boolean result = token.isAuthenticated();
		if (result) {
			//Session will be set for this user until user logout
			SecurityContextHolder.getContext().setAuthentication(token);
		}

		return result;
		
	
	}


	

}
