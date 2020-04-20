package com.example.theatre.api;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.theatre.entity.TheaterEntity;
import com.example.theatre.model.AddNewTheater;
import com.example.theatre.model.TheaterDTO;
import com.example.theatre.service.TheaterService;

@RestController
@CrossOrigin
public class TheaterAPI {
	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	TheaterService theaterService;
	
	//fetches all theaters
		@RequestMapping(value = "/getalltheaters", method = RequestMethod.GET)
	    public List<TheaterEntity> allTheaters(TheaterDTO model) {
	        return theaterService.getAllTheaters();  
	    }
		
	// Fetches details of a specific theater
	@RequestMapping(value = "/theater/{theaterName}/theaterdetails", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<TheaterDTO> getTheaterDetails(@PathVariable String theaterName) {

		logger.info("Theaterdetails request for user {}", theaterName);

		return theaterService.getTheaterDetails(theaterName);
	} 
	
	// adds new theater
	@PostMapping(value = "/addTheater")
	public AddNewTheater addTheater(@RequestBody AddNewTheater addNewTheater) {	
		return theaterService.addTheater(addNewTheater);
		
	} 
	
	// updates a theater
		@PutMapping(value = "/theater/update" ,produces = MediaType.APPLICATION_JSON_VALUE)
		public AddNewTheater updateTheater(@RequestBody AddNewTheater theater) {
			return theaterService.updateTheater(theater);
		} 
		
	// deletes theater
		@RequestMapping(value = "/theater/{theaterName}", method = RequestMethod.DELETE )
		public String delete(@PathVariable String theaterName) {
		String message;
		message = theaterService.delete(theaterName);
		return message;
	} 
}

