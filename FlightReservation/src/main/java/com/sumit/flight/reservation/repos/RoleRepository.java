package com.sumit.flight.reservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sumit.flight.reservation.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Integer>{
	
	

}
