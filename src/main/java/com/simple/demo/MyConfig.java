package com.simple.demo;

import com.simple.demo.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
    @Bean
    public HelloService helloService(){
        System.out.println("添加组件：helloService");
        return new HelloService();
    }
}
