package com.cqust.springclude.service;

import com.cqust.springcloud.entities.Dept;

import java.util.List;

public interface DeptService {
    Dept get(Long deptno);

    boolean addDept(Dept dept);

    List<Dept> list();
}
