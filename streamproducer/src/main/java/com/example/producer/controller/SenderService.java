package com.example.producer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;


//消息发送者
@Service
public class SenderService {

    //spring cloud stream里面发消息通过 Source 发送
    @Autowired
    private Source source;

    /**
     * 发送消息的方法
     * @param message
     */
    public Object sendMessage(String message){
        MessageBuilder<String> messageBuilder = MessageBuilder.withPayload(message);
        boolean send = source.output().send(messageBuilder.build());
        System.out.println("发送消息:" + message + send);
        return "发送消息:" + message;
    }
}