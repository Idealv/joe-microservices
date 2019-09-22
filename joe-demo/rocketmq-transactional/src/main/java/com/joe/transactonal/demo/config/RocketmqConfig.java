package com.joe.transactonal.demo.config;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.SubscribableChannel;

@EnableBinding({Source.class, RocketmqConfig.MySink.class})
public class RocketmqConfig {
    public interface MySink{
        @Input(Sink.INPUT)
        SubscribableChannel input();

        //Dead-letter Queue
        @Input("inputDlq")
        SubscribableChannel inputDlq();
    }
}
