//package com.example.rocketmq.controller;
//
//import com.example.rocketmq.producer.RocketMqClient;
//import org.apache.rocketmq.client.producer.DefaultMQProducer;
//import org.apache.rocketmq.client.producer.SendResult;
//import org.apache.rocketmq.common.message.Message;
//import org.apache.rocketmq.remoting.common.RemotingHelper;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
///**
// * description
// *
// * @author N 2019/11/02 14:08
// */
//@RestController
//public class DemoController {
//
//    private final RocketMqClient rocketMqClient;
//
//    public DemoController(RocketMqClient rocketMqClient) {
//        this.rocketMqClient = rocketMqClient;
//    }
//
//    @GetMapping("/send")
//    public String send(String para){
//        DefaultMQProducer producer = rocketMqClient.getProducer();
//        try {
//            Message message = new Message("nichuan-topic","my-tag",para.getBytes(RemotingHelper.DEFAULT_CHARSET));
//            SendResult result = producer.send(message);
//            System.out.println(result);
//        } catch (Exception e){
//            e.printStackTrace();
//        }
//        return para;
//    }
//}
