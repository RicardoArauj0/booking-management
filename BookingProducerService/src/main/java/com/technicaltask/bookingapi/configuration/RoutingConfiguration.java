package com.technicaltask.bookingapi.configuration;

import org.springframework.amqp.core.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RoutingConfiguration {

    @Value("${topic.booking.routing}")
    private String routingBookingTopic;

    @Value("${direct.add.routing}")
    private String routingAdd;

    @Value("${direct.edit.routing}")
    private String routingEdit;

    @Value("${direct.delete.routing}")
    private String routingDelete;

    @Bean
    public Binding bindingTopicExchangeBookingExchange(DirectExchange directBookingExchange,
                                                        TopicExchange topicBookingExchange) {
        return BindingBuilder.bind(directBookingExchange).to(topicBookingExchange).with(routingBookingTopic);
    }

    @Bean
    public Binding bindingAuditQueueToTopicExchange(TopicExchange topicBookingExchange, Queue auditQueue) {
        return BindingBuilder.bind(auditQueue).to(topicBookingExchange).with(routingBookingTopic);
    }

    @Bean
    public Binding bindingAddQueueToTopicExchange(DirectExchange directBookingExchange, Queue addQueue) {
        return BindingBuilder.bind(addQueue).to(directBookingExchange).with(routingAdd);
    }

    @Bean
    public Binding bindingEditQueueToTopicExchange(DirectExchange directBookingExchange, Queue editQueue) {
        return BindingBuilder.bind(editQueue).to(directBookingExchange).with(routingEdit);
    }

    @Bean
    public Binding bindingDeleteQueueToTopicExchange(DirectExchange directBookingExchange, Queue deleteQueue) {
        return BindingBuilder.bind(deleteQueue).to(directBookingExchange).with(routingDelete);
    }

}
