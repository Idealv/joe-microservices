package com.joe.transactonal.demo.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class IntegralReceiveService {
    @StreamListener(Sink.INPUT)
    public void receive(Message message){
        String consumeError = (String)message.getHeaders().get("consumeError");
        if ("1".equals(consumeError)) {
            log.error("============Exception：积分进程挂了，消费消息失败");
            //模拟插入订单后服务器挂了，没有commit事务消息
            throw new RuntimeException("积分服务器挂了");
        }


        log.info("============收到订单信息，增加积分:" + message);
    }

    /**
     * 消费死信队列
     */
    @StreamListener("inputDlq")
    public void receiveDlq(Message message) {
        String orderId = (String)message.getHeaders().get("orderId");
        log.info("============消费死信队列消息，记录日志并预警：" + orderId);
    }

}
