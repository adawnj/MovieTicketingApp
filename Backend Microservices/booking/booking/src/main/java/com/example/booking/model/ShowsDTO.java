package com.example.booking.model;
import java.sql.Date;
import com.example.booking.entity.ShowsEntity;

public class ShowsDTO {

	private Integer unitPrice;
	private Integer availableSeats;
	private String showTime;
	private Date showDate;

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
	public static ShowsDTO valueOf(ShowsEntity shows) {
		// TODO Auto-generated method stub
		ShowsDTO showsDTO = new ShowsDTO();
		showsDTO.setUnitPrice(shows.getUnitPrice());
		showsDTO.setAvailableSeats(shows.getAvailableSeats());
		showsDTO.setShowTime(shows.getShowTime());
		return showsDTO;
	}
}


