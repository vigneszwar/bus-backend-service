package com.bus.busticket_backend.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ValueGenerationType;

import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class paymentDetails {
    @Id

    @GeneratedValue(strategy= GenerationType.IDENTITY)

        private int paymentID;
        private int bookingID;
        private double amount;
        private Date paymentDate;
        private String paymentMethod;
        private boolean isPaid;

    // Getters and Setters
        public int getPaymentID() {
            return paymentID;
        }

        public void setPaymentID(int paymentID) {
            this.paymentID = paymentID;
        }

        public int getBookingID() {
            return bookingID;
        }

        public void setBookingID(int bookingID) {
            this.bookingID = bookingID;
        }

        public double getAmount() {
            return amount;
        }

        public void setAmount(double amount) {
            this.amount = amount;
        }

        public Date getPaymentDate() {
            return paymentDate;
        }

        public void setPaymentDate(Date paymentDate) {
            this.paymentDate = paymentDate;
        }

        public String getPaymentMethod() {
            return paymentMethod;
        }

        public void setPaymentMethod(String paymentMethod) {
            this.paymentMethod = paymentMethod;
        }

        public boolean isPaid() {
            return isPaid;
        }

        public void setPaid(boolean paid) {
            isPaid = paid;
        }


    }


