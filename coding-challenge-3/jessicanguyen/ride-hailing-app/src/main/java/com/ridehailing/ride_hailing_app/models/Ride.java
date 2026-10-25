package com.ridehailing.ride_hailing_app.models;

import com.ridehailing.ride_hailing_app.enums.RideStatus;

public class Ride {
    private String id;
    private String passengerId;
    private Location pickup;
    private Location destination;
    private RideStatus status;
    private String assignedDriverId;

    public Ride() {
    }

    public Ride(
            String id,
            String passengerId,
            Location pickup,
            Location destination,
            RideStatus status,
            String assignedDriverId) {
        this.id = id;
        this.passengerId = passengerId;
        this.pickup = pickup;
        this.destination = destination;
        this.status = status;
        this.assignedDriverId = assignedDriverId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(String passengerId) {
        this.passengerId = passengerId;
    }

    public Location getPickup() {
        return pickup;
    }

    public void setPickup(Location pickup) {
        this.pickup = pickup;
    }

    public Location getDestination() {
        return destination;
    }

    public void setDestination(Location destination) {
        this.destination = destination;
    }

    public RideStatus getStatus() {
        return status;
    }

    public void setStatus(RideStatus status) {
        this.status = status;
    }

    public String getAssignedDriverId() {
        return assignedDriverId;
    }

    public void setAssignedDriverId(String assignedDriverId) {
        this.assignedDriverId = assignedDriverId;
    }
}
