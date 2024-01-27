package com.deep.filim.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.deep.filim.model.User;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {

	@Query("Select count(id) from User where uEmail=:email")
	int findByEmail(@Param("email") String email);

}
