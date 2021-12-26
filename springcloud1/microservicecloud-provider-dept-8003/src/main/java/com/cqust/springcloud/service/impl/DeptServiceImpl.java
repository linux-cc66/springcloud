package com.cqust.springcloud.service.impl;

import com.cqust.springcloud.dao.DeptDao;
import com.cqust.springcloud.entities.Dept;
import com.cqust.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName DeptServiceImpl
 * @Description T0D0
 * @Author cc
 * @Date 2021/12/23 20:20
 * @Version 1.0
 **/
@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    DeptDao deptDao;
    @Override
    public Dept get(Long deptno) {
        return deptDao.findById(deptno);
    }

    @Override
    public boolean addDept(Dept dept) {
        return deptDao.addDept(dept);
    }

    @Override
    public List<Dept> list() {
        return deptDao.findAll();
    }
}
