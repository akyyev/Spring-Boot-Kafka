package com.codekerki.spring_boot_kafka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.codekerki.spring_boot_kafka.config.KafkaTopicConfig;
import com.codekerki.spring_boot_kafka.model.Order;

@Service
public class KafkaProducer {
    
    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;

    public void sendMessage(String message) {
        kafkaTemplate.send(KafkaTopicConfig.MESSAGE_TOPIC, message);
    }

    public void putAnOrder(Order order) {
        kafkaTemplate.send(KafkaTopicConfig.ORDER_TOPIC, order);
    }
}
