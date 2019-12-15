package com.technicaltask.bookingconsumerservice.service;

import com.technicaltask.bookingconsumerservice.dto.BookingDTO;
import com.technicaltask.bookingconsumerservice.model.Booking;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ConsumerService {

    private static final Logger logger = LoggerFactory.getLogger(ConsumerService.class);

    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private BookingService bookingService;

    @RabbitListener(queues = "${booking.add.queue}")
    public void listenerAddQueue(BookingDTO bookingDTO) {
        logger.info("Booking request received to create: {}", bookingDTO.toString());
        bookingService.addBooking(bookingDTO);
    }

    @RabbitListener(queues = "${booking.edit.queue}")
    public void listenerEditQueue(Booking booking) {
        logger.info("Booking request received to edit: {}", booking.toString());
        bookingService.editBooking(booking);
    }

    @RabbitListener(queues = "${booking.delete.queue}")
    public void listenerDeleteQueue(UUID uuid) {
        logger.info("Booking request received to delete: {}", uuid);
        bookingService.deleteBooking(uuid);
    }

    @RabbitListener(queues = "${booking.audit.queue}")
    public void handleAuditQueue(Booking booking) {
        logger.info("Booking received to audit: {}", booking.toString());
    }
}
