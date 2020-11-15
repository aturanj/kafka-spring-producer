package com.vs.kafkaspringproducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class KafkaSpringProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkaSpringProducerApplication.class, args);
    }
}
