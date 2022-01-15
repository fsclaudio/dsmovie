package com.fsc.dsmovie.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fsc.dsmovie.Services.ScoreService;
import com.fsc.dsmovie.dto.MovieDto;
import com.fsc.dsmovie.dto.ScoreDto;

@RestController
@RequestMapping(value = "/scores")
public class ScoreController {
	
	@Autowired
	private ScoreService servive;
	
	@PutMapping
	public MovieDto saveScore(@RequestBody ScoreDto dto){
		MovieDto movieDto = servive.saveScore(dto);
		return movieDto;
	}
}
