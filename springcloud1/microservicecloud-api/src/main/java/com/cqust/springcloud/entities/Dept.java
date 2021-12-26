package com.cqust.springcloud.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @ClassName Dept
 * @Description Dpet
 * @Author cc
 * @Date 2021/12/23 16:41
 * @Version 1.0
 **/
@Data
@NoArgsConstructor
@ToString
@Accessors(chain = true)
public class Dept implements Serializable {//微服务必须实现序列化
    private Long deptno;//主键
    private String dname;//部门名称
    private String db_source;//来自哪个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库

    public Dept(String dname) {
        this.dname = dname;
    }
}
