package com.technicaltask.bookingapi.service.Impl;

import com.technicaltask.bookingapi.dto.BookingDTO;
import com.technicaltask.bookingapi.model.Booking;
import com.technicaltask.bookingapi.service.ProducerService;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ProducerServiceImpl implements ProducerService {

    @Value("${booking.topic.exchange}")
    private String topicExchange;

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Override
    public void sendMessageToTopicExchange(String key, BookingDTO bookingDTO) {
        rabbitTemplate.convertAndSend(topicExchange, key, bookingDTO);
    }

    @Override
    public void sendMessageToTopicExchange(String key, Booking booking) {
        rabbitTemplate.convertAndSend(topicExchange, key, booking);
    }

    @Override
    public void sendMessageToTopicExchange(String key, UUID uuid) {
        rabbitTemplate.convertAndSend(topicExchange, key, uuid);
    }
}
