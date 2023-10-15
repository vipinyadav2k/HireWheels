package org.ncu.hirewheels.model;

import javax.persistence.*;

@Entity
@Table(name = "location")
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "location_id", nullable = false, updatable = false)
    private Long locationId;

    @Column(name = "location_name", length = 50, nullable = false)
    private String locationName;

    @Column(name = "address", length = 100, nullable = false)
    private String address;

//    @ManyToOne
//    @JoinColumn(name = "city_id", nullable = false)
//    private City city;

    @Column(name = "pincode", length = 6, nullable = false)
    private String pincode;

    // Getters and setters for the fields

    public Long getLocationId() {
        return locationId;
    }

    public void setLocationId(Long locationId) {
        this.locationId = locationId;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    //public City getCity() {
    		//     return city;
        // }

    // public void setCity(City city) {
    	//    this.city = city;
    //}

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }
}
