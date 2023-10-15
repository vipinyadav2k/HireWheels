package org.ncu.hirewheels.repository;

import java.util.List;

import org.ncu.hirewheels.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle,Long>{

	List<Vehicle> findByAvailabilityStatus(int availabilityStatus);

}
