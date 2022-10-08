package com.example.order.config;

import feign.Contract;
import feign.Logger;
import feign.Request;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//添加@Configuration注解表示全局启用,不加则局部启用
@Configuration
public class OpenFeignConfig {

//    修改日志级别 默认为没有日志
    @Bean
    public Logger.Level openfeignLoggerLevel() {
        //日志级别为debbug , 但springboot默认级别是info
        // 单独配置
        return Logger.Level.FULL;
    }

// 修改为feign原生注解模式
//    @Bean
//    public Contract feignContract(){
//        return new Contract.Default();
//    }



//    超时配置
    @Bean
    public Request.Options options() {
        return new Request.Options(5000,10000);
    }






}
