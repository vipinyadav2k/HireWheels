package org.ncu.hirewheels.repository;

import org.ncu.hirewheels.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository extends  JpaRepository<Booking, Long> {

	//Booking findByUserId(String userId);

}
