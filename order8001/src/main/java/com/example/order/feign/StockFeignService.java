package com.example.order.feign;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * name 服务名
 * path 控制器路由
 * 方法 与接口一一对应
 */

@FeignClient(name="stock-service",path="/stock")
public interface StockFeignService {
    @RequestMapping("/reduce")
    String reduce();
}