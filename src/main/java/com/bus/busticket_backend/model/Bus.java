package com.bus.busticket_backend.model;

public class Bus {
    private String busName;          // Primary Key
    private String busNumber;
    private int capacity;
    private String driverName;
    private String driverContact;


    public Bus(String busName, String busNumber, int capacity, String driverName, String driverContact) {
        this.busName = busName;
        this.busNumber = busNumber;
        this.capacity = capacity;
        this.driverName = driverName;
        this.driverContact = driverContact;
    }

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
