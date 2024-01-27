package com.deep.filim.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deep.filim.model.Theatre;
import com.deep.filim.model.TheatreScreen;
import com.deep.filim.service.TheatreService;

import jakarta.ws.rs.GET;

@RestController
@RequestMapping("/theatre")
public class TheatreController {
	
	private TheatreService theatreService;

	public TheatreController(TheatreService theatreService) {
		this.theatreService=theatreService;
	}
	
	
	@PostMapping("/register")
	public ResponseEntity<Theatre> createNewTheatre(@RequestBody Theatre theatre){
		return theatreService.saveNewTheatre(theatre);
	}
	
	
	@GetMapping("/getscreens/{id}")
	public ResponseEntity<List<TheatreScreen>> getTheatreScreens(@PathVariable Long id){
		return theatreService.getScreens(id);
	}
	
	@GetMapping("/getAllTheatre")
	public ResponseEntity<List<Theatre>> getAllTheatre(){
		return theatreService.getAllTheatre();
	}
}
