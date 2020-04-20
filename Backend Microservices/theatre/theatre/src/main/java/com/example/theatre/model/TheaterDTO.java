package com.example.theatre.model;

import com.example.theatre.entity.TheaterEntity;

public class TheaterDTO {

	private String theaterName;
	private String address;
	private Integer seatingCapacity;
	public String city;
	
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
    public String getCity() {
        return city;
    }
 
    public void setCity(String city) {
        this.city = city;
    }
    
    
	public static TheaterDTO valueOf(TheaterEntity theater) {
		// TODO Auto-generated method stub
		TheaterDTO theaterDTO = new TheaterDTO();
		theaterDTO.setTheaterName(theater.getTheaterName());
		theaterDTO.setAddress(theater.getAddress());
		theaterDTO.setSeatingCapacity(theater.getSeatingCapacity());
		theaterDTO.setCity(theater.getCity());
		return theaterDTO;
	}

}

