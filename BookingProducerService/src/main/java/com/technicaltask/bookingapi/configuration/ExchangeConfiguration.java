package com.technicaltask.bookingapi.configuration;

import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ExchangeConfiguration {

    @Value("${booking.direct.exchange}")
    private String directBookingExchange;

    @Value("${booking.topic.exchange}")
    private String topicBookingExchange;

    @Bean
    public DirectExchange directBookingExchange() {
        return new DirectExchange(directBookingExchange);
    }

    @Bean
    public TopicExchange topicBookingExchange() {
        return new TopicExchange(topicBookingExchange);
    }
}
