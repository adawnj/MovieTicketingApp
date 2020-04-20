package com.example.booking.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "theater",schema="public")
public class TheaterEntity implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "theaterid")
	Integer theaterId;
	@Column(name = "theatername", nullable = false)
	String theaterName;
	@Column(nullable = false)
	String address;
	@Column(name = "seatingcapacity" , nullable = false)
	Integer seatingCapacity;
	@Column(nullable = false)
	String city;
	
	public TheaterEntity() {
		super();
	}

	public Integer getTheaterId() {
        return theaterId;
    }
    
	public void setTheaterId(Integer theaterId) {
        this.theaterId = theaterId;
    }

    public String getTheaterName() {
        return theaterName;
    }
 
    public void setTheaterName(String theaterName) {
        this.theaterName = theaterName;
    }
 
    public String getAddress() {
        return address;
    }
 
    public void setAddress(String address) {
        this.address = address;
    }
    
    public Integer getSeatingCapacity(){
	return seatingCapacity;
    }
    
    public void setSeatingCapacity(Integer seatingCapacity){
	this.seatingCapacity = seatingCapacity;
    }
    
    public void setCity(String city) {
        this.city = city;
    }
    public String getCity() {
        return city;
    }
}

