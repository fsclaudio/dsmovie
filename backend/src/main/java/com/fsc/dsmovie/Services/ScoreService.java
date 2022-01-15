package com.fsc.dsmovie.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fsc.dsmovie.dto.MovieDto;
import com.fsc.dsmovie.dto.ScoreDto;
import com.fsc.dsmovie.entities.Movie;
import com.fsc.dsmovie.entities.Score;
import com.fsc.dsmovie.entities.User;
import com.fsc.dsmovie.repositories.MovieRepository;
import com.fsc.dsmovie.repositories.ScoreRepository;
import com.fsc.dsmovie.repositories.UserRepository;

@Service
public class ScoreService {

	@Autowired
	private MovieRepository movieRepository;
	
	@Autowired
	private UserRepository useRepository;
	
	@Autowired
	private ScoreRepository scoreRepository;
	
	@Transactional
	public MovieDto saveScore(ScoreDto dto) {
		
		User user = useRepository.findByEmail(dto.getEmail());
		
		if(user == null) {
			user = new User();
			user.setEmail(dto.getEmail());
			user = useRepository.saveAndFlush(user);	
		}
		
		Movie movie = movieRepository.findById(dto.getMovieId()).get();
		
		Score score = new Score();
		score.setMovie(movie);
		score.setUser(user);
		score.setValue(dto.getScore());
	
		score =  scoreRepository.saveAndFlush(score);
		double sum = 0.0;
		for (Score s: movie.getScores()) {
		
			sum = sum + s.getValue();
		}
		
		double avg = sum / movie.getScores().size();
		
		movie.setScore(avg);
		movie.setCount(movie.getScores().size());
		
		movie = movieRepository.save(movie);
		
		return new MovieDto(movie);
	}	
}
