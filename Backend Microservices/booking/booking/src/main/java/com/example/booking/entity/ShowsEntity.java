package com.example.booking.entity;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "show",schema="public")
public class ShowsEntity implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "showid")
	Integer showId;
	@Column(name="unitprice", nullable = false)
	Integer unitPrice;
	@Column(name="availableseats", nullable = false)
	Integer availableSeats;
	@Column(name="showtime", nullable = false)
	String showTime;
	@Column(name="showdate", nullable = false)
	Date showDate;
	@Column(name="moviename", nullable = false)
	String movieName;
	@Column(name="theatername", nullable = false)
	String theaterName;
	
	public ShowsEntity() {
		super();
	}
	
	public Integer getShowId() {
        return showId;
    }
    
	public void setShowId(Integer showId) {
        this.showId = showId;
    }

    public String getMovieName() {
        return movieName;
    }
    
    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }
    
    public String getTheaterName() {
        return theaterName;
    }
    
	public void setTheaterName(String theaterName) {
        this.theaterName = theaterName;
    }
 
    public Integer getUnitPrice(){
    	return unitPrice;
        }
 
    public void setUnitPrice(Integer unitPrice) {
        this.unitPrice= unitPrice;
    }
    public Integer getAvailableSeats() {
        return availableSeats;
    }
    
	public void setAvailableSeats(Integer availableSeats) {
        this.availableSeats = availableSeats;
    }
	public String getShowTime() {
        return showTime;
    }
    
	public void setShowTime(String showTime) {
        this.showTime = showTime;
    }
	public Date getShowDate() {
        return showDate;
    }
    
	public void setShowDate(Date showDate) {
        this.showDate = showDate;
    }
}
