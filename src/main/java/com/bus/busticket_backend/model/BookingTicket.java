package com.bus.busticket_backend.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class BookingTicket {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookingId;

    private int userId;
    private int busID;
    private int routeID;
    private Date bookingDate;
    private int seatNumber;
    private String bookingStatus;

    public Long getBookingId()
{
    return bookingId;
}
public void setBookingId(Long bookingId)
{
    this.bookingId = bookingId;
}
    public int getUserID() {
        return userId;
    }

    public void setUserID(int userId) {
        this.userId = userId;
    }
    public int getBusID() {
        return busID;
    }

    public void setBusID(int busID) {
        this.busID = busID;
    }
    public int getRouteID() {
        return routeID;
    }

    public void setRouteID(int routeID) {
        this.routeID = routeID;
    }
    public Date getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }
    public String getBookingStatus() {
        return bookingStatus;
    }

    public void setBookingStatus(String bookingStatus) {
        this.bookingStatus = bookingStatus;
    }


}