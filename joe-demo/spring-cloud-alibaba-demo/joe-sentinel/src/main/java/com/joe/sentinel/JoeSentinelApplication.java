package com.joe.sentinel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class JoeSentinelApplication {
    public static void main(String[] args) {
        SpringApplication.run(JoeSentinelApplication.class, args);
    }
}
