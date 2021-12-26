package com.cqust.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ClassName Consumer80_feign_App
 * @Description T0D0
 * @Author cc
 * @Date 2021/12/23 21:33
 * @Version 1.0
 **/
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.cqust.springcloud"})
public class Consumer80_feign_App {
    public static void main(String[] args) {
        SpringApplication.run(Consumer80_feign_App.class,args);
    }
}
