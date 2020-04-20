package com.example.Movie.model;

import java.sql.Date;

import com.example.Movie.entity.MovieEntity;

public class MovieDTO {
	private String movieName;
	private String genre;
	private Date releaseDate;
	private Integer rating;

	public String getMovieName() {
        return movieName;
    }
 
    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }
 
    public String getGenre() {
        return genre;
    }
 
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public Date getReleaseDate(){
	return releaseDate;
    }
    public void setReleaseDate(Date releaseDate){
	this.releaseDate = releaseDate;
    }
    public Integer getRating(){
	return rating;
    }
    public void setRating(Integer rating){
	this.rating = rating;
    }

	public static MovieDTO valueOf(MovieEntity movie) {
		// TODO Auto-generated method stub
		MovieDTO movieDTO = new MovieDTO();
		movieDTO.setMovieName(movie.getMovieName());
		movieDTO.setGenre(movie.getGenre());
		movieDTO.setReleaseDate(movie.getReleaseDate());
		movieDTO.setRating(movie.getRating());
		return movieDTO;
	}

}
