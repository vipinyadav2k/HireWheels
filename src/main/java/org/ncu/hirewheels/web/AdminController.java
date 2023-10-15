package org.ncu.hirewheels.web;

import java.util.List;

import org.ncu.hirewheels.model.Booking;
import org.ncu.hirewheels.model.User1;
import org.ncu.hirewheels.model.Vehicle;
import org.ncu.hirewheels.service.AdminService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@Controller
public class AdminController {
	
	private AdminService adminService;

	public AdminController(AdminService adminService) {
		super();
		this.adminService = adminService;
	}
	
	@GetMapping("/data")
	@ResponseBody
	public List<Vehicle> getAllVehiclesInJson() {
	    List<Vehicle> vehicles = adminService.getAllVehicles();
	    return vehicles;
	}

	@GetMapping("/vehicle")
	public String getAllVehicles(Model model){
		List<Vehicle> vehicles = adminService.getAllVehicles();
		model.addAttribute("vehicles", vehicles);
		return "vehicles"; // This corresponds to the "vehicles.html" template file
	}
	
	
	@GetMapping(value="/abcd")
    public List<Vehicle> getAllVehicles() {
        List<Vehicle> vehicles1 = adminService.getAllVehicles();
        return vehicles1;
    }
	
	
	
	
	@GetMapping("/vehicle/new")
	public String addVehicle(Model model) {
		
		Vehicle vehicle = new Vehicle();
		model.addAttribute("vehicle",vehicle);
		return "add_vehicle";
	}
	
	@PostMapping("/vehicle")
	public String saveStudent(@ModelAttribute("vehicle") Vehicle vehicle) {
		adminService.saveVehicle(vehicle);
		return "redirect:/vehicle";
	}
	
	@GetMapping("/vehicle/edit/{vehicleId}")
	public String editVehicleForm(@PathVariable Long vehicleId, Model model) {
		model.addAttribute("vehicle", adminService.getVehicleById(vehicleId));
		return "edit_vehicle";
	}

	@PostMapping("/vehicle/{vehicleId}")
	public String updateVehicle(@PathVariable Long vehicleId,
			@ModelAttribute("vehicle") Vehicle vehicle,
			Model model) {
		
		// get student from database by id
		Vehicle existingVehicle = adminService.getVehicleById(vehicleId);
		existingVehicle.setVehicleId(vehicleId);
	    existingVehicle.setVehicleModel(vehicle.getVehicleModel());
	    existingVehicle.setVehicleNumber(vehicle.getVehicleNumber());
	    existingVehicle.setColor(vehicle.getColor());
	    existingVehicle.setLocationId(vehicle.getLocationId());
	    existingVehicle.setFuelTypeId(vehicle.getFuelTypeId());
	    existingVehicle.setAvailabilityStatus(vehicle.getAvailabilityStatus());
	    existingVehicle.setVehicleImageUrl(vehicle.getVehicleImageUrl());
		
		// save updated student object
		adminService.updateVehicle(existingVehicle);
		return "redirect:/vehicle";		
	}
	
	@GetMapping("/vehicle/{vehicleId}")
	public String deleteStudent(@PathVariable Long vehicleId) {
	adminService.deleteVehicleById(vehicleId);
		return "redirect:/vehicle";
	}
	
	@GetMapping("/bookings")
	public String getAllBookings(Model model){
		List<Booking> booking = adminService.getAllBookings();
		model.addAttribute("bookings", booking);
		return "all_booking"; // This corresponds to the "vehicles.html" template file
	}
	
	@GetMapping("/customers")
	public String getAllCustomers(Model model) {
	    List<User1> users = adminService.getUsersByRole();
	    model.addAttribute("users", users);
	    return "all_customers";
	}
}
