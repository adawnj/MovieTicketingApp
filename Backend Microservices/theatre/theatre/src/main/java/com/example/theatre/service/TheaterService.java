package com.example.theatre.service;

import java.util.List;

import com.example.theatre.entity.TheaterEntity;
import com.example.theatre.model.AddNewTheater;
import com.example.theatre.model.TheaterDTO;

public interface TheaterService {
	 List<TheaterDTO> getTheaterDetails (String theaterName);
	 AddNewTheater addTheater(AddNewTheater addNewTheater);
	 AddNewTheater updateTheater(AddNewTheater theater);
	 String delete(String theaterName);
	 List<TheaterEntity> getAllTheaters();
} 
