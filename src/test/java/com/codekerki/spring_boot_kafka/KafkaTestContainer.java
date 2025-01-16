package com.codekerki.spring_boot_kafka;

import org.testcontainers.containers.KafkaContainer;
import org.testcontainers.utility.DockerImageName;

// @Testcontainer
public class KafkaTestContainer {
    
    public static void main(String[] args) {
        try (KafkaContainer kafkaContainer = new KafkaContainer(DockerImageName.parse("confluentinc/cp-kafka:7.5.0"))) {
            kafkaContainer.start();

            System.out.println("Kafka bootstrap servers: " + kafkaContainer.getBootstrapServers());

            kafkaContainer.stop();
        }
    }
}