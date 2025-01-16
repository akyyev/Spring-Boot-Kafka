package com.codekerki.spring_boot_kafka.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaTopicConfig {
    
    public static final String MESSAGE_TOPIC = "msg_topic";
    public static final String ORDER_TOPIC = "order_topic";


}
