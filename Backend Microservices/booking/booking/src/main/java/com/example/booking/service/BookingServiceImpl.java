package com.example.booking.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.booking.dao.BookingDAO;
import com.example.booking.dao.MovieDAO;
import com.example.booking.dao.ShowsDAO;
import com.example.booking.dao.TheaterDAO;
import com.example.booking.dao.UserDAO;
import com.example.booking.entity.BookingEntity;
import com.example.booking.entity.MovieEntity;
import com.example.booking.entity.TheaterEntity;
import com.example.booking.entity.ShowsEntity;
import com.example.booking.model.AddShowDTO;
import com.example.booking.model.BookTicketDTO;
import com.example.booking.model.BookingDTO;
import com.example.booking.model.ShowsDTO;
import com.example.booking.entity.UserEntity;
@Service
public class BookingServiceImpl implements BookingService {

	@Autowired
	BookingDAO bookingDAO;
	
	@Autowired
	ShowsDAO showsDAO;
	
	@Autowired
	TheaterDAO theaterDAO;
	
	@Autowired
	MovieDAO movieDAO;
	
	@Autowired
	UserDAO userDAO;
	
	Logger logger = LoggerFactory.getLogger(this.getClass());
	

	/* @Override
	public BookTicketDTO getBookingDetails(BookTicketDTO bookTicket) {
		// TODO Auto-generated method stub

		logger.info("Bookingdetails request for customer {}", bookTicket.getMovieName());
		String message = null;
		String theaterName = bookTicket.getTheaterName();
		String username = bookTicket.getUserName();
		String city = bookTicket.getCity();
		String movieName=bookTicket.getMovieName();
		TheaterEntity theaterEntity = theaterDAO.findByTheaterNameAndCity(theaterName,city);
	
		UserEntity userEntity = userDAO.findByUserName(userName);
		MovieEntity movieEntity= movieDAO.findByMovieName(movieName);
		String theaterName1=theaterEntity.getTheaterName();
		String movieName1= movieEntity.getMovieName();
		String userName1= userEntity.getUserName();
		
		ShowsEntity showsEntity= showsDAO.findByMovieNameAndTheaterName(movieName1,theaterName1);
		float totalCost = 0;
		Integer availableSeats = 0;
		if (movieName1!=null && theaterName1!=null)
		{
		BookingEntity bookingEntity = new BookingEntity();
		bookingEntity.setUserName(userName1);
		bookingEntity.setShowId(showsEntity.getShowId());
		bookingEntity.setSeatsBooked(bookTicket.getSeatsforBooking());
		totalCost = ( bookTicket.getSeatsforBooking() * showsEntity.getUnitPrice() );
		bookingEntity.setTotalCost(totalCost);
		availableSeats = ( showsEntity.getAvailableSeats() - bookTicket.getSeatsforBooking() );
		showsEntity.setAvailableSeats(availableSeats);
		showsDAO.save(showsEntity);
		bookingDAO.save(bookingEntity);
			message ="Booking Successful'";
		}
		return bookTicket;
	}  */
	
	@Override
	public BookingEntity book(BookingDTO bookDTO) {
		Integer showId = bookDTO.getShowId();
		Integer seatsBooked = bookDTO.getSeatsBooked();
		String userName = bookDTO.getUserName();
		ShowsEntity showsEntity = showsDAO.findByShowId(showId);
		UserEntity userEntity = userDAO.findByUserName(userName);
		BookingEntity bookingEntity = new BookingEntity();
		float totalCost = 0;
		Integer availableSeats = 0;
		if (showId!=null && seatsBooked!=null)
		{
			bookingEntity.setUserName(bookDTO.getUserName());
			bookingEntity.setShowId(showsEntity.getShowId());
			bookingEntity.setSeatsBooked(bookDTO.getSeatsBooked());
			totalCost = ( bookDTO.getSeatsBooked() * showsEntity.getUnitPrice() );
			bookingEntity.setTotalCost(totalCost);
			availableSeats = ( showsEntity.getAvailableSeats() - bookDTO.getSeatsBooked() );
			showsEntity.setAvailableSeats(availableSeats);
			showsDAO.save(showsEntity);
			bookingDAO.save(bookingEntity);
			}
			return bookingEntity;
		}
	
	
	@Override
	public List<ShowsDTO> getShowDetails(Integer showId) {
		// TODO Auto-generated method stub

		logger.info("Showdetails request for customer {}", showId);

		ShowsEntity showsEntities=showsDAO.findByShowId(showId);
		List<ShowsDTO> showsDTO = new ArrayList<ShowsDTO>();
		showsDTO.add(ShowsDTO.valueOf(showsEntities));
		
		return showsDTO;
	}


	public ShowsEntity addShow(AddShowDTO showsDTO) {
		ShowsEntity show1 = new ShowsEntity();
		show1.setMovieName(showsDTO.getMovieName());
		show1.setTheaterName(showsDTO.getTheaterName());
			show1.setShowDate(showsDTO.getShowDate());
			show1.setShowTime(showsDTO.getShowTime());
			show1.setAvailableSeats(showsDTO.getAvailableSeats());
			show1.setUnitPrice(showsDTO.getUnitPrice());
			showsDAO.save(show1);
		return show1;
	}


	public ShowsEntity updateShow(AddShowDTO shows) {
		ShowsEntity show1 = new ShowsEntity();
		show1 = showsDAO.findByShowId(shows.getShowId());
		show1.setMovieName(shows.getMovieName());
		show1.setTheaterName(shows.getTheaterName());
		show1.setShowDate(shows.getShowDate());
		show1.setShowTime(shows.getShowTime());
		show1.setAvailableSeats(shows.getAvailableSeats());
		show1.setUnitPrice(shows.getUnitPrice());
		showsDAO.save(show1);
		return show1;
	}


	@Override
	public List<ShowsEntity> getAllShows(String movieName ,AddShowDTO model) {
		return showsDAO.findAllByMovieName(movieName);
    }

	public String deleteShow(Integer showId) {
		String message = null;
		ShowsEntity show1 = new ShowsEntity();
		show1 = showsDAO.findByShowId(showId);
		if ( show1.getShowId().equals(showId)){
			message = "Show has been deleted successfully";
			showsDAO.delete(show1);
		}
		return message;
	}
	
	@Override
	public List<BookingEntity> getAllBookings(String userName ,BookingDTO model) {
		return bookingDAO.findAllByUserName(userName);
    }
	
	public List<BookingEntity> moviebooking(BookingDTO model) {
		return bookingDAO.findAll();
  }
	
	public List<ShowsEntity> getAllShows() {
        return showsDAO.findAll();
    }

	public String delete(Integer bookingId) {
		String message = null;
		Integer availableSeats = 0;
		BookingEntity booking1 = new BookingEntity();
		ShowsEntity show1 = new ShowsEntity();
		booking1 = bookingDAO.findByBookingId(bookingId);
		show1 = showsDAO.findByShowId(booking1.getShowId());
		if ( booking1.getBookingId().equals(bookingId)){
			availableSeats = ( show1.getAvailableSeats() + booking1.getSeatsBooked() );
			show1.setAvailableSeats(availableSeats);
			message = "Booking has been cancelled successfully";
			bookingDAO.delete(booking1);
		}
		return message;
	}		
}