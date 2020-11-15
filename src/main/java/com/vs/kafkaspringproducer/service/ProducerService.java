package com.vs.kafkaspringproducer.service;

import com.vs.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProducerService {

    private final KafkaTemplate<String, Message> kafkaTemplate;

    @Autowired
    public ProducerService(KafkaTemplate<String, Message> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void produce(Message message) {

        System.out.println("Producing the message: " + message);

        kafkaTemplate.send("messages-topic", message);
    }
}
