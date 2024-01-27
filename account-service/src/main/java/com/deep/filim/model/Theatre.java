package com.deep.filim.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Theatre {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String email;
	private String mobile;
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "address_id")
	private TheatreAddress theatreAddress;
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name="th_cred_id")
	private TheatreCred theatreCred;
	
	
//	@OneToMany(cascade = CascadeType.REMOVE)
//	@JoinColumn(name = "theatre_id")
//	private List<TheatreShow> theatreShow;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "theatre_id")
	private List<TheatreScreen> theatreScreens;

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getMobile() {
		return mobile;
	}

	public TheatreAddress getTheatreAddress() {
		return theatreAddress;
	}

	public TheatreCred getTheatreCred() {
		return theatreCred;
	}

	

	public List<TheatreScreen> getTheatreScreens() {
		return theatreScreens;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public void setTheatreAddress(TheatreAddress theatreAddress) {
		this.theatreAddress = theatreAddress;
	}

	public void setTheatreCred(TheatreCred theatreCred) {
		this.theatreCred = theatreCred;
	}

	

	public void setTheatreScreens(List<TheatreScreen> theatreScreens) {
		this.theatreScreens = theatreScreens;
	}
	
	
	
}
