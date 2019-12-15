package com.technicaltask.bookingapi.configuration;

import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class QueueConfiguration {

    @Value("${booking.audit.queue}")
    private String auditQueue;

    @Value("${booking.add.queue}")
    private String addQueue;

    @Value("${booking.edit.queue}")
    private String editQueue;

    @Value("${booking.delete.queue}")
    private String deleteQueue;

    @Bean
    public Queue auditQueue() {
        return new Queue(auditQueue);
    }

    @Bean
    public Queue addQueue() {
        return new Queue(addQueue);
    }

    @Bean
    public Queue editQueue() {
        return new Queue(editQueue);
    }

    @Bean
    public Queue deleteQueue() {
        return new Queue(deleteQueue);
    }
}
