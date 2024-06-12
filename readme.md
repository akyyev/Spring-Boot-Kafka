# Spring Boot PUB/SUB server with Kafka
This is small project to understand how to integrate with kafka pub sub (event streaming) server.

## How to run
- Download kafka: https://downloads.apache.org/kafka/3.7.0/kafka-3.7.0-src.tgz
- Go to kafka folder
- Extract and run gradle command to build
- Start zookeeper: bin/zookeeper-server-start.sh config/zookeeper.properties
- Start kafka server: bin/kafka-server-start.sh config/server.properties
- Run spring boot server
- Post a message by hitting send endpoint
```
curl --location --request POST 'http://127.0.0.1:8080/api/v1/send?message=another%20two'
```