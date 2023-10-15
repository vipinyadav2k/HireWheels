package org.ncu.hirewheels.service.impl;

import java.util.List;

import org.ncu.hirewheels.model.Vehicle;
import org.ncu.hirewheels.repository.VehicleRepository;
import org.ncu.hirewheels.service.CustomerService;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService{

	
	private VehicleRepository vehicleRepository;

	public CustomerServiceImpl(VehicleRepository vehicleRepository) {
		super();
		this.vehicleRepository = vehicleRepository;
	}
	
	@Override
	public Vehicle getVehicleById(Long id) {
		return vehicleRepository.findById(id).get();
	}
	
	@Override
	 public List<Vehicle> getAllVehiclesWithAvailabilityStatus(int availabilityStatus) {
	        return vehicleRepository.findByAvailabilityStatus(availabilityStatus);
	  }

	
	
}
