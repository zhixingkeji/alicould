package com.example.order.config;


//注意这个配置文件不能放在springApplication能自动扫描到的地方

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class RibbonConfig {
    @Bean
    public IRule iRule(){
        // 默认负载均衡策略 轮询
        return new RoundRobinRule();
    }

}
