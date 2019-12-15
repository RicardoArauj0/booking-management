package com.technicaltask.bookingconsumerservice.repository;

import com.technicaltask.bookingconsumerservice.model.TripWaypoint;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface TripWaypointRepository extends CrudRepository<TripWaypoint, UUID> {
}
