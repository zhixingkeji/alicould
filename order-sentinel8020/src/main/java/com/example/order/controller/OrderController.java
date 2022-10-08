package com.example.order.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/order")
public class OrderController {


    //生成订单
    @GetMapping("/add")
    public String add(){
        System.out.println("生成订单");

        return "生成订单";
    }

    //查询订单
    @GetMapping("/get")
    public String get(){
        System.out.println("查询订单");

        return "查询订单";
    }
}
