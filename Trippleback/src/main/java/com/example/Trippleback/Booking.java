package com.example.Trippleback;

import jakarta.persistence.*;

@Entity
@Table(name = "bookings")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String riderName;
    private int riderAge;
    private String riderGender;
    private String riderExperience;
    private String riderContact;
    private String riderEmail;
    private String tourName;
    private String accommodationType;
    private int numRiders;
    private String tripType;
    private String bikeType;
    private String bikeModel;
   

    // Default constructor
    public Booking() {
    }

    // Parameterized constructor
    public Booking(String riderName, int riderAge, String riderGender, String riderExperience, String riderContact,
                   String riderEmail, String tourName, String accommodationType, int numRiders, String tripType,
                   String bikeType, String bikeModel) {
        this.riderName = riderName;
        this.riderAge = riderAge;
        this.riderGender = riderGender;
        this.riderExperience = riderExperience;
        this.riderContact = riderContact;
        this.riderEmail = riderEmail;
        this.tourName = tourName;
        this.accommodationType = accommodationType;
        this.numRiders = numRiders;
        this.tripType = tripType;
        this.bikeType = bikeType;
        this.bikeModel = bikeModel;
        
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRiderName() {
        return riderName;
    }

    public void setRiderName(String riderName) {
        this.riderName = riderName;
    }

    public int getRiderAge() {
        return riderAge;
    }

    public void setRiderAge(int riderAge) {
        this.riderAge = riderAge;
    }

    public String getRiderGender() {
        return riderGender;
    }

    public void setRiderGender(String riderGender) {
        this.riderGender = riderGender;
    }

    public String getRiderExperience() {
        return riderExperience;
    }

    public void setRiderExperience(String riderExperience) {
        this.riderExperience = riderExperience;
    }

    public String getRiderContact() {
        return riderContact;
    }

    public void setRiderContact(String riderContact) {
        this.riderContact = riderContact;
    }

    public String getRiderEmail() {
        return riderEmail;
    }

    public void setRiderEmail(String riderEmail) {
        this.riderEmail = riderEmail;
    }

    public String getTourName() {
        return tourName;
    }

    public void setTourName(String tourName) {
        this.tourName = tourName;
    }

    public String getAccommodationType() {
        return accommodationType;
    }

    public void setAccommodationType(String accommodationType) {
        this.accommodationType = accommodationType;
    }

    public int getNumRiders() {
        return numRiders;
    }

    public void setNumRiders(int numRiders) {
        this.numRiders = numRiders;
    }

    public String getTripType() {
        return tripType;
    }

    public void setTripType(String tripType) {
        this.tripType = tripType;
    }

    public String getBikeType() {
        return bikeType;
    }

    public void setBikeType(String bikeType) {
        this.bikeType = bikeType;
    }

    public String getBikeModel() {
        return bikeModel;
    }

    public void setBikeModel(String bikeModel) {
        this.bikeModel = bikeModel;
    }

    

    @Override
    public String toString() {
        return "Booking{" +
                "id=" + id +
                ", riderName='" + riderName + '\'' +
                ", riderAge=" + riderAge +
                ", riderGender='" + riderGender + '\'' +
                ", riderExperience='" + riderExperience + '\'' +
                ", riderContact='" + riderContact + '\'' +
                ", riderEmail='" + riderEmail + '\'' +
                ", tourName='" + tourName + '\'' +
                ", accommodationType='" + accommodationType + '\'' +
                ", numRiders=" + numRiders +
                ", tripType='" + tripType + '\'' +
                ", bikeType='" + bikeType + '\'' +
                ", bikeModel='" + bikeModel + '\'' +
                
                '}';
    }
}
