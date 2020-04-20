package com.example.booking.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "movie", schema="public")
public class MovieEntity implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "movieid")
	Integer movieId;
	@Column(name="moviename", nullable = false)
	String movieName;
	@Column(name="genre", nullable = false)
	String genre;
	@Column(name="releasedate", nullable = false)
	Date releaseDate;
	@Column(name="rating", nullable = false)
	Integer rating;
	
	
	public MovieEntity() {
		super();
	}
	
	public Integer getMovieId() {
        return movieId;
    }
    
	public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }

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
