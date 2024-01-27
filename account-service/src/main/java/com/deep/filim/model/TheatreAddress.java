package com.deep.filim.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class TheatreAddress {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String street;
	private String landmark;
	private String city;
	private String pin;
	private String state;
	private String country;
	public Long getId() {
		return id;
	}
	public String getStreet() {
		return street;
	}
	public String getLandmark() {
		return landmark;
	}
	public String getCity() {
		return city;
	}
	public String getPin() {
		return pin;
	}
	public String getState() {
		return state;
	}
	public String getCountry() {
		return country;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	public void setState(String state) {
		this.state = state;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
	
}
