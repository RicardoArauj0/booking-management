package com.technicaltask.bookingconsumerservice.model;

import org.hibernate.annotations.Type;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.Instant;
import java.util.UUID;

@Entity
public class TripWaypoint {

    @Id
    @Type(type = "uuid-char")
    private UUID tripWayPointId;

    @ManyToOne(fetch = FetchType.LAZY)
    private Booking booking;

    private Boolean lastStop;
    private String locality;
    private Double lat;
    private Double lng;

    @UpdateTimestamp
    private Instant tripWayPointTimestamp;

    public TripWaypoint() {
    }

    public UUID getTripWayPointId() {
        return tripWayPointId;
    }

    public void setTripWayPointId(UUID tripWayPointId) {
        this.tripWayPointId = tripWayPointId;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    public Boolean getLastStop() {
        return lastStop;
    }

    public void setLastStop(Boolean lastStop) {
        this.lastStop = lastStop;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLng() {
        return lng;
    }

    public void setLng(Double lng) {
        this.lng = lng;
    }

    public Instant getTripWayPointTimestamp() {
        return tripWayPointTimestamp;
    }

    public void setTripWayPointTimestamp(Instant tripWayPointTimestamp) {
        this.tripWayPointTimestamp = tripWayPointTimestamp;
    }

    @Override
    public String toString() {
        return "TripWaypoint{" +
                "tripWayPointId=" + tripWayPointId +
                ", booking=" + booking +
                ", lastStop=" + lastStop +
                ", locality='" + locality + '\'' +
                ", lat=" + lat +
                ", lng=" + lng +
                ", tripWayPointTimestamp=" + tripWayPointTimestamp +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TripWaypoint that = (TripWaypoint) o;
        return tripWayPointId.equals(that.tripWayPointId);
    }

    @Override
    public int hashCode() {
        return 31;
    }
}
