package com.technicaltask.bookingapi.controller;

import com.technicaltask.bookingapi.dto.BookingDTO;
import com.technicaltask.bookingapi.model.Booking;
import com.technicaltask.bookingapi.service.ProducerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;


@RestController
@RequestMapping(value = "/api/booking-management")
public class BookingProducerController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private ProducerService producerService;

    @Value("${direct.add.routing}")
    private String routingAdd;

    @Value("${direct.edit.routing}")
    private String routingEdit;

    @Value("${direct.delete.routing}")
    private String routingDelete;

    @PostMapping("/booking")
    public ResponseEntity addBooking(@RequestBody BookingDTO bookingDTO) {
        producerService.sendMessageToTopicExchange(routingAdd, bookingDTO);
        logger.info("Message: {} with key '{}' was sent to Exchange.", bookingDTO, routingAdd);
        return ResponseEntity.ok("Booking sent to creation.");
    }

    @PutMapping("/booking")
    public ResponseEntity editBooking(@RequestBody Booking booking) {
        producerService.sendMessageToTopicExchange(routingEdit, booking);
        logger.info("Message: {} with key '{}' was sent to Exchange.", booking, routingEdit);
        return ResponseEntity.ok("Booking sent to edition.");
    }

    @DeleteMapping("/booking/{uuid}")
    public ResponseEntity deleteBooking(@PathVariable(value = "uuid") UUID uuid) {
        producerService.sendMessageToTopicExchange(routingDelete, uuid);
        logger.info("Message: {} with key '{}' was sent to Exchange.", uuid, routingDelete);
        return ResponseEntity.ok("Booking sent to deletion.");
    }

}
