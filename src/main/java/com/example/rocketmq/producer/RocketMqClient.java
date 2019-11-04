//package com.example.rocketmq.producer;
//
//import org.apache.rocketmq.client.exception.MQClientException;
//import org.apache.rocketmq.client.producer.DefaultMQProducer;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Component;
//
//import javax.annotation.PostConstruct;
//
///**
// * <p>
// *
// * </p>
// *
// * @author chuan.ni@hand-china.com 2019/11/02 13:35
// */
//@Component
//public class RocketMqClient {
//
//    private final static Logger logger = LoggerFactory.getLogger(RocketMqClient.class);
//    @Value("${apache.rocketmq.producer.producerGroup}")
//    private String producerGroup;
//
//    @Value("${apache.rocketmq.namesrvAddr}")
//    private String namesrvAddr;
//
//    private DefaultMQProducer producer;
//
//    @PostConstruct
//    private void defaultMqProducer(){
//        logger.info("init rocketMq producer...");
//        producer = new DefaultMQProducer(producerGroup);
//        producer.setNamesrvAddr(namesrvAddr);
//        try {
//            producer.start();
//        } catch (MQClientException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public DefaultMQProducer getProducer() {
//        return producer;
//    }
//}
