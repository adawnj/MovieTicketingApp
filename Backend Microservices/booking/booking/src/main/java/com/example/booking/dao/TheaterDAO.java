package com.example.booking.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.booking.entity.TheaterEntity;

@Repository
public interface TheaterDAO extends JpaRepository<TheaterEntity, Integer> {
	
	List<TheaterEntity> findByTheaterName(String theaterName);
	TheaterEntity findByTheaterNameAndCity(String theaterName, String city);

}
