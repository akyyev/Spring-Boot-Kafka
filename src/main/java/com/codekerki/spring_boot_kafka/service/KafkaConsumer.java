package com.codekerki.spring_boot_kafka.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.codekerki.spring_boot_kafka.config.KafkaTopicConfig;
import com.codekerki.spring_boot_kafka.model.Order;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class KafkaConsumer {
    
    @KafkaListener(topics = KafkaTopicConfig.MESSAGE_TOPIC, groupId = "group_id")
    public void consumeMessage(String message) {
        log.info("Kafka message fetched, message: {}", message);
    }

    @KafkaListener(topics = KafkaTopicConfig.ORDER_TOPIC, groupId = "group_id")
    public void consumeOrders(Order order) {
        log.info("Kafka message fetched, order received: {}", order);
    }

}
