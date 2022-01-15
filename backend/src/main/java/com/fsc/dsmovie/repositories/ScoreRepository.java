package com.fsc.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fsc.dsmovie.entities.Score;
import com.fsc.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}
