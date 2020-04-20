package com.example.Movie.model;

import java.sql.Date;

public class AddNewMovie {
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


}
