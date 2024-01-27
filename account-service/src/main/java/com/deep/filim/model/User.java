package com.deep.filim.model;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String uName;
	
	private String uEmail;
	
	private String uPhone;
	
	
	private LocalDate dateStamp=LocalDate.now();
	
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name="user_cred_id")
	private UserCred userCred;
	
	
//	@OneToMany( cascade =  CascadeType.REMOVE)  // by default fetch type LAZY  //mappedBy = "user",
//	@JoinColumn(name="user_id") 
//	private List<UserBooking> userBooking;


	public Long getId() {
		return id;
	}


	public String getuName() {
		return uName;
	}


	public String getuEmail() {
		return uEmail;
	}


	public String getuPhone() {
		return uPhone;
	}


	public LocalDate getDateStamp() {
		return dateStamp;
	}


	public UserCred getUserCred() {
		return userCred;
	}


	


	public void setId(Long id) {
		this.id = id;
	}


	public void setuName(String uName) {
		this.uName = uName;
	}


	public void setuEmail(String uEmail) {
		this.uEmail = uEmail;
	}


	public void setuPhone(String uPhone) {
		this.uPhone = uPhone;
	}


	public void setDateStamp(LocalDate dateStamp) {
		this.dateStamp = dateStamp;
	}


	public void setUserCred(UserCred userCred) {
		this.userCred = userCred;
	}


	
	
	
	
	
	
	

	
}
