package com.technicaltask.bookingconsumerservice.model;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jdk8.Jdk8Deserializers;
import com.fasterxml.jackson.datatype.jsr310.deser.key.OffsetDateTimeKeyDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.OffsetDateTimeSerializer;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Entity
public class Booking {

    @Id
    @Type(type = "uuid-char")
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

    @CreationTimestamp
    private Instant createdOn;

    @UpdateTimestamp
    private Instant lastModifiedOn;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "booking")
    private List<TripWaypoint> tripWayPoints = new ArrayList<>();

    public Booking() {}

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

    public Instant getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Instant createdOn) {
        this.createdOn = createdOn;
    }

    public Instant getLastModifiedOn() {
        return lastModifiedOn;
    }

    public void setLastModifiedOn(Instant lastModifiedOn) {
        this.lastModifiedOn = lastModifiedOn;
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
                ", createdOn=" + createdOn +
                ", lastModifiedOn=" + lastModifiedOn +
                ", tripWayPoints=" + tripWayPoints +
                '}';
    }
}