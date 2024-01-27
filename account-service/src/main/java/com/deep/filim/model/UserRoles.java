package com.deep.filim.model;



import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;

@Entity
public class UserRoles {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	private String Roles;
	
	
//	@ManyToMany
//	@JoinColumn(name="user_cred_id")
//	private List<UserCred> userCred;


	public Long getId() {
		return id;
	}


	public String getRoles() {
		return Roles;
	}


//	public List<UserCred> getUserCred() {
//		return userCred;
//	}


	public void setId(Long id) {
		this.id = id;
	}


	public void setRoles(String roles) {
		Roles = roles;
	}


//	public void setUserCred(List<UserCred> userCred) {
//		this.userCred = userCred;
//	}
//	
	
	
}
