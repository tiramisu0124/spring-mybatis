package com.spring.mybatis.condition;

import java.util.List;

public class Condition {
    private Integer deptno;
    private Double salary;
    private List<Integer> empnos;

    public Integer getDeptno() {
        return deptno;
    }

    public void setDeptno( Integer deptno ) {
        this.deptno = deptno;
    }
}
