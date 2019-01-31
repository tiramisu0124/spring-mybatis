package com.spring.mybatis.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class Emp implements Serializable{
    private Integer empno;
    private String ename;
    private String job;
    private Integer mgr;
    private Date hiredate;
    private Double sal;
    private Double comm;
    private Integer deptno;

    /**
     * 关联属性，用于封装员工对应的部门信息
     */
    private Dept dept;

    public Dept getDept() {
        return dept;
    }

    public void setDept( Dept dept ) {
        this.dept = dept;
    }

    public Integer getEmpno() {
        return empno;
    }

    public void setEmpno( Integer empno ) {
        this.empno = empno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname( String ename ) {
        this.ename = ename;
    }

    public String getJob() {
        return job;
    }

    public void setJob( String job ) {
        this.job = job;
    }

    public Integer getMgr() {
        return mgr;
    }

    public void setMgr( Integer mgr ) {
        this.mgr = mgr;
    }

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate( Date hiredate ) {
        this.hiredate = hiredate;
    }

    public Double getSal() {
        return sal;
    }

    public void setSal( Double sal ) {
        this.sal = sal;
    }

    public Double getComm() {
        return comm;
    }

    public void setComm( Double comm ) {
        this.comm = comm;
    }

    public Integer getDeptno() {
        return deptno;
    }

    public void setDeptno( Integer deptno ) {
        this.deptno = deptno;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "empno=" + empno +
                ", ename='" + ename + '\'' +
                ", job='" + job + '\'' +
                ", mgr=" + mgr +
                ", hiredate=" + hiredate +
                ", sal=" + sal +
                ", comm=" + comm +
                ", deptno=" + deptno +
                '}';
    }
}
