package com.technicaltask.bookingconsumerservice.service;

import com.technicaltask.bookingconsumerservice.dto.BookingDTO;
import com.technicaltask.bookingconsumerservice.model.Booking;

import java.util.UUID;

public interface BookingService {
    /**
     * Maps the bookingDTO object to booking object using ModelMapper
     * Set a random UUID to booking
     * Set the booking for each Tripwaypoint
     * Save the booking
     */
    void addBooking(BookingDTO bookingDTO);

    /**
     * Set a random UUID to booking
     * Set the booking for each Tripwaypoint
     * Save the booking
     */
    void editBooking(Booking booking);

    void deleteBooking(UUID uuid);


}
