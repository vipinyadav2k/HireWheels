package org.ncu.hirewheels.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "booking")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "booking_id", nullable = false, updatable = false)
    private Long bookingId;

    @Column(name = "pickup_date", nullable = false)
    private Date pickupDate;

    @Column(name = "dropoff_date", nullable = false)
    private Date dropoffDate;

    @Column(name = "booking_date", nullable = false)
    private Date bookingDate;

    @Column(name = "amount" , nullable = false)
    private Integer amount;
    
    @Column(name="location" , nullable = false)
    private String Location;
    
    @Column(name="vehicle_id" , nullable = false)
    private Long vehicleId;
    
    @Column(name="user_id" , nullable = false)
    private String UserId;


//    @ManyToOne
//    @JoinColumn(name = "location_id", nullable = false)
//    private Location location;
//
//    @ManyToOne
//    @JoinColumn(name = "vehicle_id", nullable = false)
//    private Vehicle vehicle;

//    @ManyToOne
//    @JoinColumn(name = "user_id", nullable = false)
//    private User1 user;

    // Getters and setters for the fields

    public Long getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(Long vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getUserId() {
		return UserId;
	}

	public void setUserId(String userId) {
		UserId = userId;
	}

	
	public String getLocation() {
		return Location;
	}

	public void setLocation(String location) {
		Location = location;
	}

	public Long getBookingId() {
        return bookingId;
    }

    public void setBookingId(Long bookingId) {
        this.bookingId = bookingId;
    }

    public Date getPickupDate() {
        return pickupDate;
    }

    public void setPickupDate(Date pickupDate) {
        this.pickupDate = pickupDate;
    }

    public Date getDropoffDate() {
        return dropoffDate;
    }

    public void setDropoffDate(Date dropoffDate) {
        this.dropoffDate = dropoffDate;
    }

    public Date getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

  

//    public Location getLocation() {
//        return location;
//    }
//
//    public void setLocation(Location location) {
//        this.location = location;
//    }
//
//    public Vehicle getVehicle() {
//        return vehicle;
//    }
//
//    public void setVehicle(Vehicle vehicle) {
//        this.vehicle = vehicle;
//    }
//
//    public User1 getUser() {
//        return user;
//    }
//
//    public void setUser(User1 user) {
//        this.user = user;
//    }
}

