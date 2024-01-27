package com.deep.filim.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class TheatreRoles {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	private String Roles;


	public Long getId() {
		return id;
	}


	public String getRoles() {
		return Roles;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public void setRoles(String roles) {
		Roles = roles;
	}
	
	
	
}
