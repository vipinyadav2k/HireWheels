package org.ncu.hirewheels.service;

import org.ncu.hirewheels.model.Booking;
import org.ncu.hirewheels.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingServiceImpl implements BookingService{

	@Autowired
	private BookingRepository bookingRepository;

	
//	@Override
//	public Booking getBookingbyUserId(String userId) {
//		// TODO Auto-generated method stub
//		return bookingRepository.findByUserId(userId);
//	}

}
