package com.example.order.controller;

import com.example.order.feign.ProductFeignService;
import com.example.order.feign.StockFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    StockFeignService stockFeignService;

    @Autowired
    ProductFeignService productFeignService;

    @Value("${server.port}")
    String port;

    @GetMapping("/add")
    public String add(){
        System.out.println("调用订单");
        String msg = stockFeignService.reduce();
        String msg2 = productFeignService.get(1);

        return "port-->"+port+"下单成功:"+ msg + "\n" +  msg2;
    }


    @GetMapping("/dubbo")
    public String dubbo(){
        System.out.println("dubbo调用开始");


        return "";
    }
}
