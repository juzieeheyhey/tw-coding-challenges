package com.ridehailing.ride_hailing_app.models;

public class Passenger {
    private String id;

    public Passenger() {
    }

    public Passenger(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
