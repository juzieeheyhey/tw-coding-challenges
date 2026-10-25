package com.ridehailing.ride_hailing_app.models;

import com.ridehailing.ride_hailing_app.enums.RideOfferStatus;

import java.time.Instant;

public class RideOffer {
    private String rideId;
    private String driverId;
    private RideOfferStatus status;
    private Instant offeredAt;
    private Instant expiresAt;

    public RideOffer() {
    }

    public RideOffer(String rideId, String driverId, Instant offeredAt, Instant expiresAt) {
        this.rideId = rideId;
        this.driverId = driverId;
        this.status = RideOfferStatus.PENDING;
        this.offeredAt = offeredAt;
        this.expiresAt = expiresAt;
    }

    public String getRideId() {
        return rideId;
    }

    public void setRideId(String rideId) {
        this.rideId = rideId;
    }

    public String getDriverId() {
        return driverId;
    }

    public void setDriverId(String driverId) {
        this.driverId = driverId;
    }

    public RideOfferStatus getStatus() {
        return status;
    }

    public void setStatus(RideOfferStatus status) {
        this.status = status;
    }

    public Instant getOfferedAt() {
        return offeredAt;
    }

    public void setOfferedAt(Instant offeredAt) {
        this.offeredAt = offeredAt;
    }

    public Instant getExpiresAt() {
        return expiresAt;
    }

    public void setExpiresAt(Instant expiresAt) {
        this.expiresAt = expiresAt;
    }
}
