package com.cqust.springcloud.controller;

import com.cqust.springcloud.entities.Dept;
import com.cqust.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @ClassName DeptController_Consumer
 * @Description T0D0
 * @Author cc
 * @Date 2021/12/23 21:14
 * @Version 1.0
 **/
@RestController
public class DeptController_Consumer {
//    private static final String REST_URL_PREFIX="http://localhost:8001";
    private static final String REST_URL_PREFIX="http://MICROSERVICECLOUD-DEPT";
    @Autowired
    DeptClientService service;
    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/consumer/dept/add")
    public boolean add(Dept dept){
        return service.addDept(dept);
    }

    @RequestMapping(value = "/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id){
        return service.findById(id);
    }

    @RequestMapping(value = "/consumer/dept/list")
    public List<Dept> list(){
        return service.findAll();
    }
}
