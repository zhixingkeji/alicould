package com.example.order.controller;


import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
    @GetMapping("/get/{id}")
    @SentinelResource(
            value="getOrder",
            blockHandler="blockHandlerGerUser",
            fallback="fallbackHandlerGerUser"
    )
    public String get(@PathVariable int id){
        System.out.println("查询订单"+id);

        return "查询订单"+id    ;
    }


    public String blockHandlerGerUser(int id, BlockException e){
        return "热点流控";

    }


    @GetMapping("/flow")
    @SentinelResource(
            value="flow",
            blockHandler="blockHandlerGerUser"
//            fallback="fallbackHandlerGerUser"
    )
    public String flow(){
//        System.out.println("");

        return "sentile持久化";
    }
}
