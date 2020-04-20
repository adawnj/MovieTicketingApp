package com.example.booking.service;


import java.util.List;

import com.example.booking.entity.BookingEntity;
import com.example.booking.entity.ShowsEntity;
import com.example.booking.model.AddShowDTO;
import com.example.booking.model.BookingDTO;
import com.example.booking.model.ShowsDTO;
public interface BookingService {

	//BookTicketDTO getBookingDetails(BookTicketDTO bookTicket);
	List<ShowsDTO> getShowDetails(Integer showId);
	ShowsEntity addShow(AddShowDTO show);
	ShowsEntity updateShow(AddShowDTO shows);
	String deleteShow(Integer showId);
	String delete(Integer bookingId);
	BookingEntity book(BookingDTO bookDTO);
	List<ShowsEntity> getAllShows(String movieName, AddShowDTO model);
	List<BookingEntity> getAllBookings(String userName, BookingDTO model);
	List<ShowsEntity> getAllShows();
	List<BookingEntity> moviebooking( BookingDTO model);
}
