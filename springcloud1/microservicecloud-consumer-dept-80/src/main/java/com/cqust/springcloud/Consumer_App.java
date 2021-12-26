package com.cqust.springcloud;

import com.cqust.springcloud.myrule.MyRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @ClassName Consumer_App
 * @Description T0D0
 * @Author cc
 * @Date 2021/12/23 21:33
 * @Version 1.0
 **/
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "MICROSERVICECLOUD-DEPT",configuration = MyRule.class)
public class Consumer_App {
    public static void main(String[] args) {
        SpringApplication.run(Consumer_App.class,args);
    }
}
