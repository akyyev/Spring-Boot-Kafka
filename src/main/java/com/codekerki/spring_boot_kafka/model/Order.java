package com.codekerki.spring_boot_kafka.model;

import lombok.Data;

@Data
public class Order {

    private String orderId; 
    private String productName; 
    private int count;

}
