package com.example.stock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Date;
import java.util.concurrent.TimeUnit;


@SpringBootApplication
public class ConfigApplication {
    public static void main(String[] args) throws InterruptedException {

        ConfigurableApplicationContext applicationContext = SpringApplication.run(ConfigApplication.class, args);


        //感受nacos配置中心的自动拉取配置文件
        while(true){
            /**
             * 获取nacos配置中心的文件
             * **/

            //从默认配置中读取user.name age
            String username = applicationContext.getEnvironment().getProperty("user.name");
            String userage = applicationContext.getEnvironment().getProperty("user.age");

            //从shared-configs配置中读取user.config
            String config = applicationContext.getEnvironment().getProperty("user.config");

            //从extension-configs配置中读取user.config
            String ex_config = applicationContext.getEnvironment().getProperty("user.config");

            //从extension-configs配置中读取user.grade
            String ex_grade = applicationContext.getEnvironment().getProperty("user.grade");


            System.out.println(new Date());
            System.out.println(username);
            System.out.println(userage);
            System.out.println(config);
            System.out.println(ex_config);
            System.out.println(ex_grade);
            //每3秒读取一次文件
            TimeUnit.SECONDS.sleep(3);
        }


    }


}
