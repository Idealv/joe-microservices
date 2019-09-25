package com.joe.producer;

import com.joe.producer.demo.entity.Order;
import com.joe.producer.demo.service.SenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.context.annotation.Bean;
import org.springframework.messaging.MessageChannel;
import com.joe.producer.RocketmqProducerApplication.MySource;

@SpringBootApplication
@EnableBinding({MySource.class})
public class RocketmqProducerApplication {
    public interface MySource{
        @Output(Source.OUTPUT)
        MessageChannel output();
    }

    public static void main(String[] args) {
        SpringApplication.run(RocketmqProducerApplication.class, args);
    }

    @Bean
    public CustomRunner customRunner(){
        return new CustomRunner();
    }

    public static class CustomRunner implements CommandLineRunner {
        @Autowired
        private SenderService senderService;

        @Override
        public void run(String... args) {
            int count = 5;
            for (int index = 1; index <= count; index++) {
                String msgContent = "msg-" + index;
                if (index % 2 == 0) {
                    senderService.sendMsg(msgContent);
                } else {
                    senderService.sendTagMsg("tagOrder",new Order((long)index, "order-"+index));
                }
            }
        }
    }
}
