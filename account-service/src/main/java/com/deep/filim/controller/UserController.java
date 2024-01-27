package com.deep.filim.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deep.filim.model.User;
import com.deep.filim.repository.UserRepo;
import com.deep.filim.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	private UserService userService;
	
	@Autowired
	private UserRepo repo;
	
	
	public UserController(UserService userService) {
		this.userService=userService;
	}



	@PostMapping("/register")
	public ResponseEntity<String> createNewUser(@RequestBody User user){
		return userService.createNewUser(user);
	}
	
	
	@GetMapping("/getAll")
	public List<User> getAll() {
		
		return repo.findAll();
	}
	
}
