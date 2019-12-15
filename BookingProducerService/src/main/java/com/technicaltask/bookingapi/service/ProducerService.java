package com.technicaltask.bookingapi.service;

import com.technicaltask.bookingapi.dto.BookingDTO;
import com.technicaltask.bookingapi.model.Booking;

import java.util.UUID;

public interface ProducerService {
    void sendMessageToTopicExchange(String key, BookingDTO bookingDTO);
    void sendMessageToTopicExchange(String key, Booking booking);
    void sendMessageToTopicExchange(String key, UUID uuid);

}
