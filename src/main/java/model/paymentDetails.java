package model;
import java.util.Date;
public class paymentDetails {
        private int paymentID;
        private int bookingID;
        private double amount;
        private Date paymentDate;
        private String paymentMethod;
        private boolean isPaid;

        // Constructors
        public paymentDetails() {
            // Default constructor
        }

        public paymentDetails(int paymentID, int bookingID, double amount, Date paymentDate, String paymentMethod, boolean isPaid) {
            this.paymentID = paymentID;
            this.bookingID = bookingID;
            this.amount = amount;
            this.paymentDate = paymentDate;
            this.paymentMethod = paymentMethod;
            this.isPaid = isPaid;
        }

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


