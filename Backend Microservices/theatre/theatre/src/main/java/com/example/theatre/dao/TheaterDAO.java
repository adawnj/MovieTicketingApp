package com.example.theatre.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.theatre.entity.TheaterEntity;

@Repository
public interface TheaterDAO extends JpaRepository<TheaterEntity, Integer> {

	TheaterEntity findByTheaterNameAndCity(String theaterName, String city);
	TheaterEntity findByTheaterName(String theaterName);

}
