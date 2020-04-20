package com.example.booking.model;

public class BookTicketDTO {

	String movieName;
	String theaterName;
	String userName;
	String city;
	Integer seatsforBooking;
	String showTime;
	String showDate;
	
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
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Integer getSeatsforBooking() {
		return seatsforBooking;
	}
	public void setSeatsforBooking(Integer seatsforBooking) {
		this.seatsforBooking = seatsforBooking;
	}
	public String getShowTime() {
		return showTime;
	}
	public void setShowTime(String showTime) {
		this.showTime = showTime;
	}
	public String getShowDate() {
		return showDate;
	}
	public void setShowDate(String showDate) {
		this.showDate = showDate;
	}
	

}
