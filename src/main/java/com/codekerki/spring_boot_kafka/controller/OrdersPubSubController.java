package com.codekerki.spring_boot_kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.codekerki.spring_boot_kafka.model.Order;
import com.codekerki.spring_boot_kafka.service.KafkaProducer;

@RestController()
public class OrdersPubSubController {

    @Autowired
    private KafkaProducer producer;

    @PostMapping("/api/v1/send")
    public String sendOrderUpdateEvent(@RequestParam("message") String message) {
        producer.sendMessage(message);
        return message;
    }

    @PostMapping("/api/v1/orderItem")
    public Order putAnOrder(@RequestBody Order order) {
        producer.putAnOrder(order);
        return order;
    }

}
