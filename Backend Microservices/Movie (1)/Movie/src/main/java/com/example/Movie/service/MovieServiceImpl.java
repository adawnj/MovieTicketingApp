package com.example.Movie.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.Movie.dao.MovieDAO;
import com.example.Movie.entity.MovieEntity;
import com.example.Movie.model.AddNewMovie;
import com.example.Movie.model.MovieDTO;

@Service
public class MovieServiceImpl implements MovieService{
	
	@Autowired
	MovieDAO movieDAO;

	Logger logger = LoggerFactory.getLogger(this.getClass());
	@Override
	public List<MovieDTO> getMovieDetails(String movieName) {
		// TODO Auto-generated method stub
		logger.info("Moviedetails request for customer {}", movieName);
		MovieEntity movieEntities=movieDAO.findByMovieName(movieName);
		List<MovieDTO> movieDTO = new ArrayList<MovieDTO>();
		movieDTO.add(MovieDTO.valueOf(movieEntities));
		return movieDTO;
	}
	
	public List<MovieEntity> getAllMovies() {
        return movieDAO.findAll();
    }
	public AddNewMovie addMovie(AddNewMovie addNewMovie) {
		String message = null;
		MovieEntity movie1 = new MovieEntity();
			message = addNewMovie.getMovieName() + " has been added successfully";
			movie1.setMovieName(addNewMovie.getMovieName());
			movie1.setGenre(addNewMovie.getGenre());
			movie1.setReleaseDate(addNewMovie.getReleaseDate());
			movie1.setRating(addNewMovie.getRating());
			movieDAO.save(movie1);
		return addNewMovie;
	}
	

	public AddNewMovie updateMovie(AddNewMovie addNewMovie) {
		MovieEntity movie1 = new MovieEntity();
		movie1 = movieDAO.findByMovieName(addNewMovie.getMovieName());
		movie1.setMovieName(addNewMovie.getMovieName());
		movie1.setGenre(addNewMovie.getGenre());
		movie1.setReleaseDate(addNewMovie.getReleaseDate());
		movie1.setRating(addNewMovie.getRating());
		movieDAO.save(movie1);
		return addNewMovie;
	} 
	
	public String delete(String movieName) {
		String message = null;
		MovieEntity movie1 = new MovieEntity();
		movie1 = movieDAO.findByMovieName(movieName);
		if ( movie1.getMovieName().equals(movieName)){
			message = movie1.getMovieName() + " has been deleted successfully";
			movieDAO.delete(movie1);
		}
		return message;
	}
}
