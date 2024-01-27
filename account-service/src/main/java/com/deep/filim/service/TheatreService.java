package com.deep.filim.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.deep.filim.model.Roles;
import com.deep.filim.model.Theatre;
import com.deep.filim.model.TheatreRoles;
import com.deep.filim.model.TheatreScreen;
import com.deep.filim.repository.TheatreRepo;

@Service
public class TheatreService {

	private TheatreRepo theatreRepo;

	@Autowired
	public TheatreService(TheatreRepo theatreRepo) {
		this.theatreRepo = theatreRepo;

	}

	public ResponseEntity<Theatre> saveNewTheatre(Theatre theatre) {
		if (emailExist(theatre.getEmail()))
			return new ResponseEntity<Theatre>(HttpStatusCode.valueOf(409));

		TheatreRoles trole = new TheatreRoles();
		trole.setRoles(Roles.THREATRE.toString()); // need to rectify
		List<TheatreRoles> list = new ArrayList<>();
		list.add(trole);
		theatre.getTheatreCred().setTheatreRoles(list);

		theatreRepo.saveAndFlush(theatre);

		return new ResponseEntity<Theatre>(theatre, HttpStatus.CREATED);

	}

	private boolean emailExist(String email) {
		if (theatreRepo.findTheatreByEmail(email) != null)
			return true;
		return false;
	}

	public ResponseEntity<List<TheatreScreen>> getScreens(Long id) {

		List<TheatreScreen> theatreScreens = theatreRepo.findById(id).orElse(new Theatre()).getTheatreScreens();
		Optional<Theatre> th=theatreRepo.findById(id);
	
		return new ResponseEntity<List<TheatreScreen>>(theatreScreens, HttpStatus.OK);

	}
	
	public ResponseEntity<List<Theatre>> getAllTheatre(){
		return new  ResponseEntity<List<Theatre>>(theatreRepo.findAll(),HttpStatus.OK);
	}

}
