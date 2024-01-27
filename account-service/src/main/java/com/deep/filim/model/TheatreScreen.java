package com.deep.filim.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
@Entity
public class TheatreScreen {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	private  String type;

	
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="screen_id")
	private List<Seat> seat;
	
	
	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	
	public String getType() {
		return type;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}


	public void setType(String type) {
		this.type = type;
	}

	public List<Seat> getSeat() {
		return seat;
	}

	public void setSeat(List<Seat> seat) {
		this.seat = seat;
	}
	
	
	
	
}
