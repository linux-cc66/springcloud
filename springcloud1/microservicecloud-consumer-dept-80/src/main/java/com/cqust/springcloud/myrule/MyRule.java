package com.cqust.springcloud.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName MyRule
 * @Description T0D0
 * @Author cc
 * @Date 2021/12/25 17:16
 * @Version 1.0
 **/
@Configuration
public class MyRule {

    @Bean
    public IRule myRule(){
        return new RandomRule();
    }
}
