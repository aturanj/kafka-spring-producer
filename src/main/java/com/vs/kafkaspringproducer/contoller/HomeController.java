package com.vs.kafkaspringproducer.contoller;

import com.vs.model.Message;
import com.vs.kafkaspringproducer.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class HomeController {

    private final ProducerService producerService;

    @Autowired
    public HomeController(ProducerService producerService) {
        this.producerService = producerService;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/generate")
    public String generate(@RequestParam("message") String message, @RequestParam("id") Long id, @RequestParam("lifetimeDay") int lifetimeDay) {
        producerService.produce(new Message(id, message, lifetimeDay));
        return "OK";
    }
}
