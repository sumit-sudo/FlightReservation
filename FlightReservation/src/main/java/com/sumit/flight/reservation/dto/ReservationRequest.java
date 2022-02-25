package com.sumit.flight.reservation.dto;

/*	REASON TO USE DTO LAYER?
 * When we can't map to entity using @ModelAttribute/@Requestbody, then we create a class inside DTO layer 
 * and perform the setter functionality.
 * 
 * For example, Suppose from a page we are accepting CreditCard details,Reservation Detail and passenger details 
 * or say out of five column in reservation table we are accepting two value( checking, no of bags of passenger)
 * SO, in first example, we can't map as @ModelAttribute/@Requestbody can only map to one class, so instead we create 
 * Request class and then there we perform setter and then we call service layer accordingly.
 * in second example- If we use @ModelAttribute/@Requestbody then other value will become null apart from 
 * checking, no of bags of passenger as It will implicitly call all setter method. SO we use a class inside DTO layer
 * and perform update operation by passing id as hidden field from front end.
 * controller>dto>service>dao 
 */


public class ReservationRequest {

	private int flightId;
	private String passengerFirstName;
	private String passengerLastName;
	private String passengerEmail;
	private String passengerPhone;
	private String nameOnTheCard;
	private int cardNumber;
	private String expirationDate;
	private String securityCode;
	
	public int getFlightId() {
		return flightId;
	}
	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}
	public String getPassengerFirstName() {
		return passengerFirstName;
	}
	public void setPassengerFirstName(String passengerFirstName) {
		this.passengerFirstName = passengerFirstName;
	}
	public String getPassengerLastName() {
		return passengerLastName;
	}
	public void setPassengerLastName(String passengerLastName) {
		this.passengerLastName = passengerLastName;
	}
	public String getPassengerEmail() {
		return passengerEmail;
	}
	public void setPassengerEmail(String passengerEmail) {
		this.passengerEmail = passengerEmail;
	}
	public String getPassengerPhone() {
		return passengerPhone;
	}
	public void setPassengerPhone(String passengerPhone) {
		this.passengerPhone = passengerPhone;
	}
	public String getNameOnTheCard() {
		return nameOnTheCard;
	}
	public void setNameOnTheCard(String nameOnTheCard) {
		this.nameOnTheCard = nameOnTheCard;
	}
	public int getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getExpirationDate() {
		return expirationDate;
	}
	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}
	public String getSecurityCode() {
		return securityCode;
	}
	public void setSecurityCode(String securityCode) {
		this.securityCode = securityCode;
	}
	
	
}
