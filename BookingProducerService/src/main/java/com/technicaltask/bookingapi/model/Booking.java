package com.technicaltask.bookingapi.model;

import com.fasterxml.jackson.datatype.jsr310.ser.OffsetDateTimeSerializer;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class Booking {

    private UUID bookingId;
    private String passengerName;
    private String passengerContactNumber;
    //private OffsetDateTime pickupTime;
    private Date pickupTime;
    private Boolean asap = true;
    private Integer waitingTime;
    private Integer noOfPassengers;
    private BigDecimal price;
    private Integer rating;
    private List<TripWaypoint> tripWayPoints;

    public Booking() {
    }

    public UUID getBookingId() {
        return bookingId;
    }

    public void setBookingId(UUID bookingId) {
        this.bookingId = bookingId;
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

    public Date getPickupTime() {
        return pickupTime;
    }

    public void setPickupTime(Date pickupTime) {
        this.pickupTime = pickupTime;
    }

    public Boolean getAsap() {
        return asap;
    }

    public void setAsap(Boolean asap) {
        this.asap = asap;
    }

    public Integer getWaitingTime() {
        return waitingTime;
    }

    public void setWaitingTime(Integer waitingTime) {
        this.waitingTime = waitingTime;
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

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public List<TripWaypoint> getTripWayPoints() {
        return tripWayPoints;
    }

    public void setTripWayPoints(List<TripWaypoint> tripWayPoints) {
        this.tripWayPoints = tripWayPoints;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingId=" + bookingId +
                ", passengerName='" + passengerName + '\'' +
                ", passengerContactNumber='" + passengerContactNumber + '\'' +
                ", pickupTime=" + pickupTime +
                ", asap=" + asap +
                ", waitingTime=" + waitingTime +
                ", noOfPassengers=" + noOfPassengers +
                ", price=" + price +
                ", rating=" + rating +
                ", tripWayPoints=" + tripWayPoints +
                '}';
    }
}
