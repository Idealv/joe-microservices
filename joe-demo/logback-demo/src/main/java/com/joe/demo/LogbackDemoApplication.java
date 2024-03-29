package com.joe.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class LogbackDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(LogbackDemoApplication.class, args);
    }
}
