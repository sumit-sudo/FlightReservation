package com.sumit.flight.reservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sumit.flight.reservation.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

}
