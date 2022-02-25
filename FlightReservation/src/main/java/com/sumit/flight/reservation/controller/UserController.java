package com.sumit.flight.reservation.controller;

import java.util.Date;
import java.util.List;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.sumit.flight.reservation.entities.User;
import com.sumit.flight.reservation.service.UserService;

@Controller
public class UserController {
	
	Logger log=LoggerFactory.getLogger(UserController.class);
	@Autowired
	private UserService uservice;
	
	@Autowired
	private BCryptPasswordEncoder encoder;
	
	@GetMapping("/showReg")
	public String home()
	{
		log.error("Inside home() of class UserController");
		return "login/registerUser";
	}
	
	@GetMapping("/showLogin")
	public String login()
	{
		return "login/login";
	}
	
	@PostMapping("/userRegistration")
	public String addUser(@ModelAttribute("user") User user)
	{
		System.out.println(user.getPassword());
		System.out.println(encoder.encode(user.getPassword()));
		
		user.setPassword(encoder.encode(user.getPassword()));
		uservice.addUser(user);
		return "login/login";
	}
	
	@RequestMapping("/login")
	public String validate(@RequestParam("email") String email, @RequestParam("password")String password, ModelMap map)
	{
		User user=uservice.searchByEmail(email);
		if(user.getPassword().equals(password))
		{
			return "findFlights";
		}
		else
		{
			String msg="Please check the credentials";
			map.addAttribute("msg",msg);
		}
		return "login/login";
	}
	
}
