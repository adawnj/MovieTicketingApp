package com.example.booking.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.booking.entity.BookingEntity;

@Repository
@Transactional
public interface BookingDAO extends JpaRepository<BookingEntity, Integer> {
	BookingEntity findByBookingId(Integer bookingId);
	List<BookingEntity> findAllByUserName(String userName);
	List<BookingEntity> findAllByShowId(Integer showId);
}
