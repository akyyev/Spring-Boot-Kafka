package com.codekerki.spring_boot_kafka.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class KafkaConsumer {
    
    @KafkaListener(topics = "test_topic", groupId = "group_id")
    public void consumer(String message) {
        log.info("Kafka message fetched, message: {}", message);
    }

}
