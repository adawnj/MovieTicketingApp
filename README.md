# MovieBookingApp
Online Movie Ticket Booking application which helps users to book desired movies and theaters with ease.

## Table of contents
* [General info](#general-info)
* [Screenshots](#screenshots)
* [Technologies](#technologies)
* [Setup](#setup)
* [Features](#features)
* [Status](#status)
* [Contact](#contact)

## General info
This project is a movie ticketing system in which users can book or cancel tickets. They can view movie and theater details and update their account information. The admin will be able to add, delete and update various components of the services.

## Screenshots
![Example screenshot](./img/screenshot.png)

## Technologies
* Technology: Java 1.8 
* IDE: STS 11 
* Database: PostgreSQL 
* Discovery Server: Eureka 
* Framework: Spring Boot Application 
* Documentation: swagger.io 
* API gateway: Zuul server 
* Registry: Eureka Server 

## Setup
* For details on installation of STS IDE, Click on https://www.javatpoint.com/spring-boot-download-and-install-sts-ide 
* To download PostgreSQL Server, Click on https://www.postgresql.org/download/
* To download Postman for testing, Click on https://www.postman.com/downloads/

## Code Examples
* To add a new Movie into the system: The API example is shown:
`@PostMapping(value = "/movie")
		public String addMovie(@RequestBody AddNewMovie addNewMovie) {
			String message;
			message = movieService.addMovie(addNewMovie);
			return message;
		} 
		`
  The Service Implementation will be as follows:
  `public String addMovie(AddNewMovie addNewMovie) {
		String message = null;
		MovieEntity movie1 = new MovieEntity();
			message = addNewMovie.getMovieName() + " has been added successfully";
			movie1.setMovieName(addNewMovie.getMovieName());
			movie1.setGenre(addNewMovie.getGenre());
			movie1.setReleaseDate(addNewMovie.getReleaseDate());
			movie1.setRating(addNewMovie.getRating());
			movieDAO.save(movie1);
		return message;
	}`

## Features
List of features ready aare as follows:
* User can register with the application and can login with password.
* User can view/update their account details and can delete their account.
* Users can view and select various movies and theaters and book their tickets with desired number of seats. They can also cancel their booking.
* Admin can add/delete/update new movies, shows and theaters.


## Status
Project is in progress. The backend is completed. Proceeding with UI part.

## Inspiration
Project based on assignment request on Spring Microservices.

## Contact
Created by [@adawnj]- feel free to contact me!
