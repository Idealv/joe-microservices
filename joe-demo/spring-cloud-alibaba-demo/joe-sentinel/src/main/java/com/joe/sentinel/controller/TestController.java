package com.joe.sentinel.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * sentinel测试类
 * blockHandler:sentinel进行限流后会阻塞抛出BlockException，客户端可以处理异常
 * fallback:sentinel进行熔断后，会使用fallback对应的方法(fallback指定的情况，若不指定使用默认方法)
 */
@RestController
@Slf4j
public class TestController {
    @GetMapping("/hello")
    @SentinelResource(value = "hello",blockHandler = "exceptionHandler")
    public String hello(String name) {
        return "hello "+name;
    }

    @GetMapping("/test")
    @SentinelResource(value = "test",fallback = "testFallback")
    public String test(){
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Test";
    }

    public String exceptionHandler(String name, BlockException e) {
        log.error("exception:",e);
        return "Oops,some error occurred!";
    }

    public String testFallback(Throwable ex){
        log.error("exception:", ex);
        return "test Fallback!";
    }

}
