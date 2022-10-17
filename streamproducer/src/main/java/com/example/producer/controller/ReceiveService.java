package com.example.producer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.stereotype.Service;

//消息消费者
@Service
public class ReceiveService {

    //spring cloud stream里面发消息通过 Sink 发送
    @Autowired
    private Sink sink;

    @StreamListener(value = Sink.INPUT)
    public void getListener(Object message){
        System.out.println("接受消息:" + message);
    }
}