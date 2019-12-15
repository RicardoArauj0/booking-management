# Getting Started

### Project
The project conteins:
* BookingProducerService - This service is responsible to expose the API and send the messages to queues
* BookingConsumerService - This service is responsible to consume the messages from queues and CRUD operations

### Setup

* Run rabbitMQ using docker-compose or run rabbitMQ that is installed on you machine
* Start the two servcices.

### RabbitMQ Topology

There are 2 Exchanges and 3 Queues:
* booking-topic is the Exchange that receives all the messages. It is bound to booking-direct exchange and booking-audit-queue by 'booking.*' routing key.
* booking-direct is the exchange tha direct the messages to the 3 booking-add-queue, booking-edit-queue and booking-delete-queue queues 

### Swagger and Database
* Swagger URL to view API documentation and send test API: http://localhost:8080/swagger-ui.htm
* H2 database URL http://localhost:8081/h2-console

### To be done
* Exception handling
* OffsetDateTime date type serialization and deserialization
* Unity testig
