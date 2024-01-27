package com.deep.filim.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.deep.filim.model.Roles;
import com.deep.filim.model.User;
import com.deep.filim.model.UserRoles;
import com.deep.filim.repository.UserRepo;

@Service
public class UserService {

	@Autowired
	private UserRepo repo;

//	private void UserService(UserRepo repo) {
//		this.repo = repo;
//	}

	public ResponseEntity<String> createNewUser(User user) {

		if (isEmailExist(user.getuEmail()))
			return new ResponseEntity<String>(HttpStatusCode.valueOf(409));

		UserRoles r = new UserRoles();
		r.setRoles(Roles.USER.toString());
		user.getUserCred().setUserRoles(List.of(r));
		repo.saveAndFlush(user);

		return new ResponseEntity<String>(HttpStatus.CREATED);
	}

	User getUserById(Long id) {
		Optional<User> user = repo.findById(id);
		return user.orElse(null);
	}

	boolean isEmailExist(String email) {
		if (repo.findByEmail(email) > 0) {
			return true;
		}
		return false;
	}

}
