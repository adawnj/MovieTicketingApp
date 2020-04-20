package com.example.theatre.model;

public class AddNewTheater {

	private String theaterName;
	private String address;
	private Integer seatingCapacity;
	private String city;
	
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
    
    
}
