package org.ncu.hirewheels.service;

import java.util.List;

import org.ncu.hirewheels.model.Booking;
import org.ncu.hirewheels.model.User1;
import org.ncu.hirewheels.model.Vehicle;

public interface AdminService {

	List<Vehicle> getAllVehicles();

	Vehicle saveVehicle(Vehicle vehicle);
	
	Vehicle getVehicleById(Long vehicleId);
	
	Vehicle updateVehicle(Vehicle vehicle);

	void deleteVehicleById(Long vehicleId);

	List<Booking> getAllBookings();

	List<User1> getUsersByRole();

}
