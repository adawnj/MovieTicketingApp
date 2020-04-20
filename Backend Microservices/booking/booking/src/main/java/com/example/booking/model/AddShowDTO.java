package com.example.booking.model;

import java.sql.Date;
import javax.persistence.Column;

import com.example.booking.entity.ShowsEntity;

public class AddShowDTO {
	private Integer showId;
	private String movieName;
	private String theaterName;
	private Integer unitPrice;
	private Integer availableSeats;
	private String showTime;
	private Date showDate;
	
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


	public static AddShowDTO valueOf(ShowsEntity shows) {
		// TODO Auto-generated method stub
		AddShowDTO showsDTO = new AddShowDTO();
		showsDTO.setShowId(shows.getShowId());
		showsDTO.setMovieName(shows.getMovieName());
		showsDTO.setTheaterName(shows.getTheaterName());
		showsDTO.setUnitPrice(shows.getUnitPrice());
		showsDTO.setAvailableSeats(shows.getAvailableSeats());
		showsDTO.setShowTime(shows.getShowTime());
		showsDTO.setShowDate(shows.getShowDate());
		return showsDTO;
	}
}
