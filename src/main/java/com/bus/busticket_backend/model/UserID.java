package com.bus.busticket_backend.model;

public class UserID {



    private String username;
    private String email;
    private String Password;
    private String FirstName;
    private String LastName;
    private int Phonenumber;
    private String Address;

    public UserID() {
        // Default constructor
    }

    public UserID(String username, String email, String Password, String FirstName, String LastName, int Phonenumber,  String Address) {
        this.username = username;
        this.email = email;

        this.Password = Password;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Phonenumber=Phonenumber;
        this.Address = Address;
    }

    // Getters and Setters
    public String getusername() {
        return username;
    }

    public void setusername(String username) {
        this.username = username;
    }

    public String getemail() {
        return email;
    }

    public void setemail(String email) {
        this.email= email;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public int Phonenumber() {
        return Phonenumber;
    }

    public void setPhonenumber(int Phonenumber) {
        this.Phonenumber = Phonenumber;
    }
    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }




}


