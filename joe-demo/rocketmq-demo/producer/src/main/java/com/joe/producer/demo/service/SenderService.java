package com.joe.producer.demo.service;

import com.joe.producer.RocketmqProducerApplication;
import org.apache.rocketmq.common.message.MessageConst;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;
import org.springframework.util.MimeTypeUtils;

import java.util.stream.Collectors;
import java.util.stream.Stream;


@Service
public class SenderService {
    @Autowired
    private RocketmqProducerApplication.MySource source;

    public void sendMsg(String msg){
        source.output().send(MessageBuilder.withPayload(msg).build());
    }

    public <T> void sendTagMsg(String tag,T msg){
        Message message = MessageBuilder.createMessage(msg,
                new MessageHeaders(Stream.of(tag).collect(Collectors
                        .toMap(str -> MessageConst.PROPERTY_TAGS, String::toString))));
        source.output().send(message);
    }
}
