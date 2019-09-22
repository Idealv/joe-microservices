package com.joe.demo.controller;

import com.joe.log.monitor.PointUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class TestController {

    @GetMapping("/test")
    public String test(){
        log.info("log info");
        log.error("log error");
        PointUtil.debug("1", "test", "test point");
        return "Test";
    }
}
