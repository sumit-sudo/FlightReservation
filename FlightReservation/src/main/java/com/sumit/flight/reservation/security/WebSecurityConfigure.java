package com.sumit.flight.reservation.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;


@Configuration
@EnableWebSecurity
@Component
public class WebSecurityConfigure extends WebSecurityConfigurerAdapter {

	
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/ADMIN/showaddflight").hasAnyAuthority("ADMIN")
		.antMatchers("/").permitAll().and().csrf().disable();
	}

	@Bean
	public BCryptPasswordEncoder getBCryptPasswordEncoder()
	{
		return new BCryptPasswordEncoder();
	}
}
