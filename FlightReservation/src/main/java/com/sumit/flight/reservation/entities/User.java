package com.sumit.flight.reservation.entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;


@Entity
public class User extends AbstractEntity{

	// How to handle particular field which have been used in multiple Class, here Id-->done
	// use setter as builder-->done
	// perform operation with out providing Id, check weather It will create Id automatically or not
	// check the output of save
	// pass the arguments from postman(done)
	// Add Exception with code(imp)
	// debug
	// create an api to insert DATE and Time stamp and exception with status code as well
	// How will you map data when we have data from two entities ( inside one page )

	//

	@Column(name="FIRST_NAME")
	private String first_name;
	@Column(name="LAST_NAME")
	private String last_name;
	@Column(name="EMAIL")
	private String email;
	@Column(name="PASSWORD")
	private String password;
	
	@ManyToMany
	@JoinTable(name="user_role",joinColumns = @JoinColumn(name="user_id"),
			inverseJoinColumns = @JoinColumn(name="role_id"))
	private Set<Role> roles;
	
	
	public Set<Role> getRoles() {
		return roles;
	}
	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
		//return new User();
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
		//return new User();
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
		//return new User();
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
		//return new User();
	}
	
}
