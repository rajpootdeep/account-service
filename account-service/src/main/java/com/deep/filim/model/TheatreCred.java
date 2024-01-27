package com.deep.filim.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
@Entity
public class TheatreCred {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String password;
	
	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinTable(name = "tcred_troles", joinColumns = @JoinColumn(name = "cred_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
	private List<TheatreRoles> theatreRoles;

	public Long getId() {
		return id;
	}

	public String getPassword() {
		return password;
	}

	public List<TheatreRoles> getTheatreRoles() {
		return theatreRoles;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setTheatreRoles(List<TheatreRoles> theatreRoles) {
		this.theatreRoles = theatreRoles;
	}
	
	
	
	
	
}
