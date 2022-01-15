package com.fsc.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fsc.dsmovie.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByEmail(String email);

}
