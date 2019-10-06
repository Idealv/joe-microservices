package com.joe.sentinel.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class TestController {
    @GetMapping("/hello")
    @SentinelResource(value = "hello",blockHandler = "exceptionHandler",fallback = "helloFallback")
    public String hello(String name){
        return "hello"+name;
    }

    public String exceptionHandler(String name, BlockException e) {
        log.error(e.getMessage());
        return "Oops,some error occurred!";
    }

    public String helloFallback(String name){
        return "Hello Fallback" + name;
    }
}
