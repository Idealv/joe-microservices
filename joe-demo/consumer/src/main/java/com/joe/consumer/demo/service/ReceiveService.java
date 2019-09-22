package com.joe.consumer.demo.service;

import com.joe.consumer.demo.entity.Order;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;



@Service
@Slf4j
public class ReceiveService {
    @StreamListener(Sink.INPUT)
    public void receiveInput(String msg){
        log.info("input receive: " + msg);
    }

    @StreamListener("input2")
    public void receiveInput2(@Payload Order order){
        log.info("input2 receive: "+order);
    }

//    @StreamListener("input3")
//    public void receiveInput3(Message message){
//        log.info("input3 receive: " + message);
//    }

}
