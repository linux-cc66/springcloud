package com.cqust.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ClassName EurekaServer7001_APP
 * @Description T0D0
 * @Author cc
 * @Date 2021/12/24 12:08
 * @Version 1.0
 **/
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer7002_APP {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer7002_APP.class,args);
    }
}
