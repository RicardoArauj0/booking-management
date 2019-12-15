package com.technicaltask.bookingconsumerservice.service.Impl;

import com.technicaltask.bookingconsumerservice.dto.BookingDTO;
import com.technicaltask.bookingconsumerservice.model.Booking;
import com.technicaltask.bookingconsumerservice.repository.BookingRepository;
import com.technicaltask.bookingconsumerservice.service.BookingService;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
public class BookingServiceImpl implements BookingService {

    private static final Logger logger = LoggerFactory.getLogger(BookingServiceImpl.class);

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private BookingRepository bookingRepository;


    /**
     * {@inheritDoc}
     */
    @Transactional
    @Override
    public void addBooking(BookingDTO bookingDTO) {
        Booking booking =  modelMapper.map(bookingDTO, Booking.class);
        logger.info("Booking model mapped: {}", booking.toString());
        booking.setBookingId(UUID.randomUUID());
        booking.getTripWayPoints().forEach(tripWaypoint ->
                tripWaypoint.setTripWayPointId(UUID.randomUUID()));
        logger.info("Booking to save {}", booking);
        booking = bookingRepository.save(booking);
        logger.info("Booking saved: {}", booking.toString());
    }

    /**
     * {@inheritDoc}
     */
    @Transactional
    @Override
    public void editBooking(Booking booking) {
        booking.getTripWayPoints().forEach(tripWaypoint -> {
            if(tripWaypoint.getTripWayPointId() == null) {
                tripWaypoint.setTripWayPointId(UUID.randomUUID());
            }
        });
        booking = bookingRepository.save(booking);
        logger.info("Booking updated: {}", booking.toString());
    }

    @Transactional
    @Override
    public void deleteBooking(UUID uuid) {
        bookingRepository.deleteById(uuid);
        logger.info("Booking with UUID '{}' deleted.", uuid);
    }
}
