package com.example.booking.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.example.booking.entity.MovieEntity;

@Repository
@Transactional
public interface MovieDAO extends JpaRepository<MovieEntity, Integer> {
	MovieEntity findByMovieName(String movieName);
}
