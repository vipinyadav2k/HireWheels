package org.ncu.hirewheels.web;

import java.util.List;

import org.ncu.hirewheels.model.Booking;
import org.ncu.hirewheels.model.User1;
import org.ncu.hirewheels.model.Vehicle;
import org.ncu.hirewheels.service.BookingService;
import org.ncu.hirewheels.service.CustomerService;
import org.ncu.hirewheels.service.User1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	public CustomerController(CustomerService customerService) {
		super();
		this.customerService = customerService;
	}
	
	@GetMapping("/book_vehicle")
	public String getAllVehicles(Model model){
		List<Vehicle> vehicles = customerService.getAllVehiclesWithAvailabilityStatus(1);
		model.addAttribute("vehicles", vehicles);
		return "book_vehicle"; 
	}
	
	 @Autowired
	    private User1Service userService;
	 

	 @GetMapping("/user_profile/{email}")
	    public String getProfile(@PathVariable String email, Model model) {
	        // Fetch user data using the provided email
	        User1 user = userService.getUserByEmail(email);

	        if (user != null) {
	            // Add the user object to the model for rendering in the view
	            model.addAttribute("user", user);
	        } else {
	            // Handle the case where no user was found with the given email
	            model.addAttribute("error", "User not found");
	        }

	        return "user_profile";
	    } 
	 
//	 @Autowired 
//	 private BookingService bookingService;
//	 
//	 @GetMapping("/booking/{userId}")
//	    public String getBooking(@PathVariable String userId, Model model) {
//	        // Fetch user data using the provided email
//	        Booking booking = bookingService.getBookingbyUserId(userId);
//
//	        if (booking != null) {
//	            // Add the user object to the model for rendering in the view
//	            model.addAttribute("booking", booking);
//	        } else {
//	            // Handle the case where no user was found with the given email
//	            model.addAttribute("error", "Booking not found");
//	        }
//
//	        return "personal_booking";
//	    } 
//	 

	 
}
