package com.fsc.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fsc.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
