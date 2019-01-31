package com.spring.mybatis.dao;

import com.spring.mybatis.annotation.MyBatisRepository;
import com.spring.mybatis.condition.Condition;
import com.spring.mybatis.entity.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@MyBatisRepository
public interface EmpDao {

    List<Emp> findAll();

    List<Emp> findBySalary(@Param("salary") double salary);

    Emp findEmpById(@Param("empno") int empno);

    List<Emp> findByDeptAndSalary(@Param("deptno") int deptno, @Param("salary") double salary);

    void updateEmp(Emp emp);

    List<Emp> findByDeptAndSalary2(@Param("deptno") int deptno, @Param("salary") double salary);

    void updateEmp2(Emp emp);

    List<Emp> findEmpByIds(@Param("ids") int[] ids);

    void addEmp( Emp emp);

    Emp findById(int id);

    Emp findById2(int id);
}
