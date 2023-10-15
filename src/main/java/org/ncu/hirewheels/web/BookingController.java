package org.ncu.hirewheels.web;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.ncu.hirewheels.dao.BookingDetailDao;
import org.ncu.hirewheels.model.Booking;
import org.ncu.hirewheels.model.Vehicle;
import org.ncu.hirewheels.repository.BookingRepository;
import org.ncu.hirewheels.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BookingController {

	@Autowired
	private BookingRepository bookingRepository;
	
	@Autowired
	private VehicleRepository vehicleRepository;
	
	@GetMapping("/book-car")
	@ResponseBody
	public BookingDetailDao bookCar(
		@RequestParam(name = "vehicleId") Long vehicleId,
	    @RequestParam String username,
	    @RequestParam String location,
	    @RequestParam("pickupDate") String pickupDateStr,
	    @RequestParam("dropoffDate") String dropoffDateStr,
	    ModelMap modelMap) {
		System.out.print(vehicleId);
	    Vehicle vehicle = vehicleRepository.findById(vehicleId).get();
	    vehicle.setAvailabilityStatus(0);
	    System.out.print(vehicle);

	    Booking newBooking = new Booking();
	    newBooking.setVehicleId(vehicleId);
	    newBooking.setLocation(location);
	    newBooking.setBookingDate(new Date());
	    newBooking.setUserId(username);
	    newBooking.setAmount(vehicle.getPrice());

	    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	    try {
	        Date pickupDate = dateFormat.parse(pickupDateStr);
	        Date dropoffDate = dateFormat.parse(dropoffDateStr);
	        newBooking.setPickupDate(pickupDate);
	        newBooking.setDropoffDate(dropoffDate);
	    } catch (ParseException e) {
	        return null; 
	    }

	    vehicleRepository.save(vehicle);
	    bookingRepository.save(newBooking);

	    BookingDetailDao bookingDetailDao = new BookingDetailDao(newBooking);
	    return bookingDetailDao;
	}

    
    
	
	
}
