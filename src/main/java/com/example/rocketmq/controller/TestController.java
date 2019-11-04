package com.example.rocketmq.controller;

import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * description
 *
 * @author N 2019/11/02 15:16
 */
@RestController
public class TestController {
    @Resource
    private RocketMQTemplate rocketMQTemplate;

    @GetMapping("/test")
    public String send(String para){
        rocketMQTemplate.convertAndSend("topic-A",para);
        return para;
    }
}
