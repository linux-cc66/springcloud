package com.cqust.springcloud.service;

import com.cqust.springcloud.entities.Dept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @ClassName DeptClientService
 * @Description T0D0
 * @Author cc
 * @Date 2021/12/25 19:43
 * @Version 1.0
 **/
@FeignClient(value = "MICROSERVICECLOUD-DEPT")
public interface DeptClientService {

    @RequestMapping(value = "/dept/list",method = RequestMethod.GET)
    public Dept findById(Long deptno);

    @RequestMapping(value = "/dept/add",method = RequestMethod.POST)
    public boolean addDept(Dept dept);

    @RequestMapping(value = "/dept/get/{id}",method = RequestMethod.GET)
    public List<Dept> findAll();
}
