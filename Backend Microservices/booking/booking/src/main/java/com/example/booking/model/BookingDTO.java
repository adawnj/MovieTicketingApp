package com.example.booking.model;

import com.example.booking.entity.BookingEntity;

public class BookingDTO {

	Integer seatsBooked;
	Integer showId;
	String userName;

    public Integer getSeatsBooked() {
        return seatsBooked;
    }
    
    public void setSeatsBooked(Integer seatsBooked ) {
        this.seatsBooked = seatsBooked;
    }
 
    public Integer getShowId(){
    	return showId;
        }
 
    public void setShowId(Integer showId) {
        this.showId = showId;
    }
    public String getUserName() {
        return userName;
    }
 
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
	public static BookingDTO valueOf(BookingEntity booking) {
		// TODO Auto-generated method stub
		BookingDTO bookingDTO = new BookingDTO();
		bookingDTO.setShowId(booking.getShowId());
		bookingDTO.setSeatsBooked(booking.getSeatsBooked());
		//bookingDTO.setUserName(booking.getUserName());
		return bookingDTO;
	}
}
