package com.example.order;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ConfigurableApplicationContext;

//启动类注解
@SpringBootApplication

//开启feign客户端
@EnableFeignClients



//修改ribbon负载均衡策略
//@RibbonClients(value={@RibbonClient(name="stock-service",configuration = RibbonConfig.class)})
public class OrderApplication {
    public static void main(String[] args) throws InterruptedException {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(OrderApplication.class, args);




    }


}
