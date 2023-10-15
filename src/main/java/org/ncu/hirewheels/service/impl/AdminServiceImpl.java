package org.ncu.hirewheels.service.impl;

import java.util.List;

import org.ncu.hirewheels.model.Booking;
import org.ncu.hirewheels.model.User1;
import org.ncu.hirewheels.model.Vehicle;
import org.ncu.hirewheels.repository.BookingRepository;
import org.ncu.hirewheels.repository.User1Repository;
import org.ncu.hirewheels.repository.VehicleRepository;
import org.ncu.hirewheels.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {

    private VehicleRepository vehicleRepository;
    private BookingRepository bookingRepository;
    private User1Repository userRepository;

    @Autowired
    public AdminServiceImpl(VehicleRepository vehicleRepository, BookingRepository bookingRepository,User1Repository userRepository) {
        this.vehicleRepository = vehicleRepository;
        this.bookingRepository = bookingRepository;
        this.userRepository =   userRepository;
    }

    @Override
    public List<Vehicle> getAllVehicles() {
        return vehicleRepository.findAll();
    }

    @Override
    public Vehicle saveVehicle(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }

    @Override
    public Vehicle getVehicleById(Long id) {
        return vehicleRepository.findById(id).orElse(null);
    }

    @Override
    public Vehicle updateVehicle(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }

    @Override
    public void deleteVehicleById(Long id) {
        vehicleRepository.deleteById(id);
    }

    @Override
    public List<Booking> getAllBookings() {
        return bookingRepository.findAll();
    }

    @Override
    public List<User1> getUsersByRole() {
        // Assuming you have a UserRepository or a similar repository for User1 entities.
        List<User1> users = userRepository.findByRole("USER");
        return users;
    }
}
