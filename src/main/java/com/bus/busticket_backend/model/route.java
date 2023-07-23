package com.bus.busticket_backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class route {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)

    private int routeId;
    private String origin;
    private String destination;
    private double distance;
    private double duration;
    private int availableSeats;

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

