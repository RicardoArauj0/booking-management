package com.technicaltask.bookingapi.model;

import java.util.UUID;

public class TripWaypoint {

    private UUID tripWayPointId;
    private Boolean lastStop;
    private String locality;
    private Double lat;
    private Double lng;

    public TripWaypoint() {
    }

    public UUID getTripWayPointId() {
        return tripWayPointId;
    }

    public void setTripWayPointId(UUID tripWayPointId) {
        this.tripWayPointId = tripWayPointId;
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

    @Override
    public String   toString() {
        return "TripWaypoint{" +
                "tripWayPointId=" + tripWayPointId +
                ", lastStop=" + lastStop +
                ", locality='" + locality + '\'' +
                ", lat=" + lat +
                ", lng=" + lng +
                '}';
    }
}
