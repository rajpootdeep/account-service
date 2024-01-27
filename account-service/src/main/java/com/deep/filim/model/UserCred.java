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
import jakarta.persistence.OneToOne;

@Entity
public class UserCred {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String uPassword;

	// private UserRoles userRoles;

//	@OneToOne(fetch = FetchType.LAZY)//,cascade = { CascadeType.DETACH, CascadeType.MERGE,CascadeType.PERSIST, CascadeType.REFRESH})  // here cascade all except Delete, now we can delete UserCred without deleting User  //here mappedBy tells hibernate to look at userCred property in User class,use the information from the User class @JoinColumn. it will help to find associated instructor
//	private User user;

	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinTable(name = "ucred_uroles", joinColumns = @JoinColumn(name = "cred_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
	private List<UserRoles> userRoles;

	public Long getId() {
		return id;
	}

	public String getuPassword() {
		return uPassword;
	}

//	public User getUser() {
//		return user;
//	}

	public List<UserRoles> getUserRoles() {
		return userRoles;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setuPassword(String uPassword) {
		this.uPassword = uPassword;
	}

//	public void setUser(User user) {
//		this.user = user;
//	}

	public void setUserRoles(List<UserRoles> userRoles) {
		this.userRoles = userRoles;
	}

}
