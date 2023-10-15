package org.ncu.hirewheels.service;

import java.util.List;

import org.ncu.hirewheels.model.Vehicle;


public interface CustomerService {

	Vehicle getVehicleById(Long id);

	List<Vehicle> getAllVehiclesWithAvailabilityStatus(int availabilityStatus);
	
	
}
