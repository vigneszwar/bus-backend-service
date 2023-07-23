package model;
import java.util.Date;
public class BookingTicket {

    private Long bookingId;

    private int userId;
    private int busID;
    private int routeID;
    private Date bookingDate;
    private int seatNumber;
    private String bookingStatus;

    public BookingTicket() {
        // Default constructor
    }
public  BookingTicket(Long bookingId,int userId,int busID,int routeID,Date bookingDate,int seatNumber,String bookingStatus)
{
    this.bookingId = bookingId;
    this.userId = userId;
    this.busID = busID;
    this.routeID =routeID;
    this.bookingDate = bookingDate;
    this.seatNumber = seatNumber;
    this.bookingStatus = bookingStatus;
}

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