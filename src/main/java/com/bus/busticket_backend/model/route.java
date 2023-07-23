package com.bus.busticket_backend.model;

public class route {
    private int routeId;
    private String origin;
    private String destination;
    private double distance;
    private double duration;
    private int availableSeats;

    public route(int routeId, String origin, String destination, double distance, double duration, int availableSeats) {
        this.routeId = routeId;
        this.origin = origin;
        this.destination = destination;
        this.distance = distance;
        this.duration = duration;
        this.availableSeats = availableSeats;
    }
    public int getRouteId() {
        return routeId;
    }
    public String getOrigin() {
        return origin;
    }
    public String getDestination() {
        return destination;
    }
    public double getDistance() {
        return distance;
    }
    public double getDuration() {
        return duration;
    }
    public int getAvailableSeats() {
        return availableSeats;
    }
    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }
    @Override
    public String toString() {
        return "Route " + routeId + ": " + origin + " to " + destination +
                ", Distance: " + distance + " km, Duration: " + duration + " hours, Available Seats: " + availableSeats;
    }
}
