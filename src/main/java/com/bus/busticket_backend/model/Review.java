package com.bus.busticket_backend.model;
import java.util.Date;
public class Review {

    //Reiew
    private int reviewID;
    private int userID;
    private int busID;
    private int rating;
    private String comment;
    private Date reviewDate;


    public Review(int reviewID, int userID, int busID, int rating, String comment, Date reviewDate) {
        this.reviewID = reviewID;
        this.userID = userID;
        this.busID = busID;
        this.rating = rating;
        this.comment = comment;
        this.reviewDate = reviewDate;
    }


    public int getReviewID() {
        return reviewID;
    }

    public void setReviewID(int reviewID) {
        this.reviewID = reviewID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getBusID() {
        return busID;
    }

    public void setBusID(int busID) {
        this.busID = busID;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Date getReviewDate() {
        return reviewDate;
    }

    public void setReviewDate(Date reviewDate) {
        this.reviewDate = reviewDate;
    }


}