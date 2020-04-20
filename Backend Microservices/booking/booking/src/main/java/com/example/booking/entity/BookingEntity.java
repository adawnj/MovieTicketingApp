package com.example.booking.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "booking",schema="public")
public class BookingEntity implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "bookingid")
	Integer bookingId;
	@Column(name = "username",nullable = false)
	String userName;
	@Column(name = "showid",nullable = false)
	Integer showId;
	@Column(name = "seatsbooked", nullable = false)
	Integer seatsBooked;
	@Column(name = "totalcost",nullable = false)
	float totalCost;
	
	public BookingEntity() {
		super();
	}
	
	public Integer getBookingId() {
        return bookingId;
    }
    
	public void setBookingId(Integer bookingId) {
        this.bookingId = bookingId;
    }

    public String getUserName() {
        return userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    public Integer getSeatsBooked() {
        return seatsBooked;
    }
    
    public void setSeatsBooked(Integer seatsBooked ) {
        this.seatsBooked = seatsBooked;
    }
    public Integer getShowId() {
        return showId;
    }
    
	public void setShowId(Integer showId) {
        this.showId = showId;
    }
 
    public float getTotalCost(){
    	return totalCost;
        }
 
    public void setTotalCost(float totalCost) {
        this.totalCost = totalCost;
    }
}
