package com.bus.busticket_backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Bus {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)

    private String busName;          // Primary Key
    private String busNumber;
    private int capacity;
    private String driverName;
    private String driverContact;

    public String getbusName() {
        return busName;
    }

    public void setBusID(String busName) {
        this.busName = busName;
    }

    public String getBusNumber() {
        return busNumber;
    }

    public void setBusNumber(String busNumber) {
        this.busNumber = busNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }
    //book
    public String getDriverContact() {
        return driverContact;
    }

    public void setDriverContact(String driverContact) {
        this.driverContact = driverContact;
    }
    //
    public String toString() {
        return "Bus{" +
                "busName=" + busName +
                ", busNumber='" + busNumber + '\'' +
                ", capacity=" + capacity +
                ", driverName='" + driverName + '\'' +
                ", driverContact='" + driverContact + '\'' +
                '}';
    }

}
