package org.ncu.hirewheels.model;
import javax.persistence.*;

@Entity
@Table(name = "vehicle")
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "vehicle_id")
    private Long vehicleId;

    @Column(name = "vehicle_model", nullable = false)
    private String vehicleModel;

    @Column(name = "vehicle_number", nullable = false)
    private String vehicleNumber;

    @Column(name = "color", nullable = false)
    private String color;

    @Column(name = "location_id", nullable = false)
    private Long locationId;

    @Column(name = "fuel_type_id", nullable = false)
    private Long fuelTypeId;
    
    @Column(name = "availability_status", nullable = false)
    private Integer availabilityStatus;

    @Column(name = "vehicle_image_url", nullable = false)
    private String vehicleImageUrl;
    
    @Column(name = "price",nullable = false)
    private Integer price;


    public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Long getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(Long vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getVehicleModel() {
		return vehicleModel;
	}

	public void setVehicleModel(String vehicleModel) {
		this.vehicleModel = vehicleModel;
	}

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Long getLocationId() {
		return locationId;
	}

	public void setLocationId(Long locationId) {
		this.locationId = locationId;
	}

	public Long getFuelTypeId() {
		return fuelTypeId;
	}

	public void setFuelTypeId(Long fuelTypeId) {
		this.fuelTypeId = fuelTypeId;
	}

	public Integer getAvailabilityStatus() {
		return availabilityStatus;
	}

	public void setAvailabilityStatus(Integer availabilityStatus) {
		this.availabilityStatus = availabilityStatus;
	}

	public String getVehicleImageUrl() {
		return vehicleImageUrl;
	}

	public void setVehicleImageUrl(String vehicleImageUrl) {
		this.vehicleImageUrl = vehicleImageUrl;
	}
	
	 public Vehicle() {}

	    public Vehicle(String vehicleModel, String vehicleNumber, String color, Long locationId, Long fuelTypeId, Integer availabilityStatus, String vehicleImageUrl,Integer price) {
	        
	    	this.vehicleModel = vehicleModel;
	        this.vehicleNumber = vehicleNumber;
	        this.color = color;
	        this.locationId = locationId;
	        this.fuelTypeId = fuelTypeId;
	        this.availabilityStatus = availabilityStatus;
	        this.vehicleImageUrl = vehicleImageUrl;
	        this.price=price;
	    }

	@Override
	public String toString() {
		return "Vehicle [vehicleId=" + vehicleId + ", vehicleModel=" + vehicleModel + ", vehicleNumber=" + vehicleNumber
				+ ", color=" + color + ", locationId=" + locationId + ", fuelTypeId=" + fuelTypeId
				+ ", availabilityStatus=" + availabilityStatus + ", vehicleImageUrl=" + vehicleImageUrl + ", price="
				+ price + "]";
	}

}
