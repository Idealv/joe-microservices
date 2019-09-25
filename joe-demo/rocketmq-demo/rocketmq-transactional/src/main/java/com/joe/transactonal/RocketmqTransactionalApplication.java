package com.joe.transactonal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

//开启事务支持
@EnableTransactionManagement
@SpringBootApplication
public class RocketmqTransactionalApplication {
    public static void main(String[] args) {
        SpringApplication.run(RocketmqTransactionalApplication.class, args);
    }
}
