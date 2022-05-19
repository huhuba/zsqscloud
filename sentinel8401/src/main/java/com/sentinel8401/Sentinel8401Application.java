package com.sentinel8401;

import feign.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class Sentinel8401Application {
    public static void main(String[] args) {
        SpringApplication.run(Sentinel8401Application.class, args);
    }

    @Bean
     public Logger.Level  feignLoggerLevel(){
        return  Logger.Level.FULL;
    }
}
