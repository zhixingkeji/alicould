package com.example.stock.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RefreshScope
@RequestMapping("/config")
public class ConfigController {

    @Value("${user.name}")
    public String username;

    @GetMapping("/show")
    public String show(){
        log.info("username: {}",username);
        return "自动获取获取username: "+username;
    }

}


