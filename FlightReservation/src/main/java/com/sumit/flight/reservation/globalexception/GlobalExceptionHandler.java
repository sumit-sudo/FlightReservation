package com.sumit.flight.reservation.globalexception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import java.time.LocalDateTime;
import com.sumit.flight.reservation.entities.ReservationNotFound;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler
	public ResponseEntity<ReservationNotFound> reservationNotFound(ReservationCustomException exe)
	{
		ReservationNotFound error=new ReservationNotFound(HttpStatus.NOT_FOUND.value(), exe.getMessage(),LocalDateTime.now());
		
		return new ResponseEntity<>(error,HttpStatus.NOT_FOUND);
	}
}
