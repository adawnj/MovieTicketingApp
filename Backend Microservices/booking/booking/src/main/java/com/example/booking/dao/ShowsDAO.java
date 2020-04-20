package com.example.booking.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.booking.entity.ShowsEntity;

@Repository
@Transactional
public interface ShowsDAO extends JpaRepository<ShowsEntity, Integer> {

	ShowsEntity findByMovieNameAndTheaterName(String movieName, String theaterName);
	ShowsEntity findByShowId(Integer showId);
	List<ShowsEntity> findAllByMovieName(String movieName);
	
}

