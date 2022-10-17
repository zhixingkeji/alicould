package com.example.producer.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/stock")
@EnableBinding({Source.class, Sink.class})
public class StockController {

    @Autowired
    private SenderService senderService;

    @Value("${server.port}")
    String port;

    @GetMapping("/reduce/{message}")
    public void reduce(@PathVariable("message") String message){
        senderService.sendMessage(message);
    }


}
