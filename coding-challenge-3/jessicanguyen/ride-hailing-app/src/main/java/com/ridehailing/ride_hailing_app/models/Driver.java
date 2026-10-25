package com.ridehailing.ride_hailing_app.models;

import com.ridehailing.ride_hailing_app.enums.DriverStatus;

public class Driver {
    private String id;
    private DriverStatus status;
    private Location location;

    public Driver() {
    }

    public Driver(String id, DriverStatus status, Location location) {
        this.id = id;
        this.status = status;
        this.location = location;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public DriverStatus getStatus() {
        return status;
    }

    public void setStatus(DriverStatus status) {
        this.status = status;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
