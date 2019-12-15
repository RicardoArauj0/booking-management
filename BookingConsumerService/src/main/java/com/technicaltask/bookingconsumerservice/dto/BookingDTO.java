package com.technicaltask.bookingconsumerservice.dto;

import com.technicaltask.bookingconsumerservice.model.TripWaypoint;

import java.math.BigDecimal;
import java.util.List;

public class BookingDTO {

    private String passengerName;
    private String passengerContactNumber;
    private Boolean asap = true;
    private Integer noOfPassengers;
    private BigDecimal price;
    private List<TripWaypoint> tripWayPoints;

    public BookingDTO() {
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public String getPassengerContactNumber() {
        return passengerContactNumber;
    }

    public void setPassengerContactNumber(String passengerContactNumber) {
        this.passengerContactNumber = passengerContactNumber;
    }

    public Boolean getAsap() {
        return asap;
    }

    public void setAsap(Boolean asap) {
        this.asap = asap;
    }

    public Integer getNoOfPassengers() {
        return noOfPassengers;
    }

    public void setNoOfPassengers(Integer noOfPassengers) {
        this.noOfPassengers = noOfPassengers;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public List<TripWaypoint> getTripWayPoints() {
        return tripWayPoints;
    }

    public void setTripWayPoints(List<TripWaypoint> tripWayPoints) {
        this.tripWayPoints = tripWayPoints;
    }

    @Override
    public String toString() {
        return "BookingDTO{" +
                "passengerName='" + passengerName + '\'' +
                ", passengerContactNumber='" + passengerContactNumber + '\'' +
                ", asap=" + asap +
                ", noOfPassengers=" + noOfPassengers +
                ", price=" + price +
                ", tripWayPoints=" + tripWayPoints +
                '}';
    }
}
