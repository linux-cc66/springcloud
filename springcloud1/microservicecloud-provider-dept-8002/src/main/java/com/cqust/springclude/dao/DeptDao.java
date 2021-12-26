package com.cqust.springclude.dao;

import com.cqust.springcloud.entities.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DeptDao {
    Dept findById(Long deptno);

    boolean addDept(Dept dept);

    List<Dept> findAll();
}
