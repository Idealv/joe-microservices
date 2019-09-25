package com.joe.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.SubscribableChannel;

@SpringBootApplication
@EnableBinding({RocketmqConsumerApplication.MySink.class})
public class RocketmqConsumerApplication {
    public interface MySink{
        @Input(Sink.INPUT)
        SubscribableChannel input();

        @Input("input2")
        SubscribableChannel input2();

//        @Input("input3")
//        SubscribableChannel input3();
    }

    public static void main(String[] args) {
        SpringApplication.run(RocketmqConsumerApplication.class, args);
    }
}
