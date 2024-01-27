package com.deep.filim.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Seat {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private byte seat_No;
	private char row_No;
	private char type;
		
	
	
	
	public Long getId() {
		return id;
	}
	public byte getSeat_No() {
		return seat_No;
	}
	public char getRow() {
		return row_No;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setSeat_No(byte seat_No) {
		this.seat_No = seat_No;
	}
	public void setRow(char row_No) {
		this.row_No = row_No;
	}
	public char getType() {
		return type;
	}
	public void setType(char type) {
		this.type = type;
	}
	
	
	
	
	
	
	
}
