package com.deep.filim.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deep.filim.model.Theatre;

@Repository
public interface TheatreRepo extends JpaRepository<Theatre, Long> {

	Theatre findTheatreByEmail(String email);
		
}
