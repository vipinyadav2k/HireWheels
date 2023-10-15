package org.ncu.hirewheels.dao;

import org.ncu.hirewheels.model.Booking;

public class BookingDetailDao {

	
	 private Booking booking;
	    

	    BookingDetailDao() {}

	    public BookingDetailDao(Booking booking) {
	        this.booking = booking;
	        
	    }

	    public Booking getBooking() {
	        return booking;
	    }

	    public void setBooking(Booking booking) {
	        this.booking = booking;
	    }
}
