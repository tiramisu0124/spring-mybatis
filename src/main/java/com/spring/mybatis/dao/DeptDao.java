package com.spring.mybatis.dao;

import com.spring.mybatis.annotation.MyBatisRepository;
import com.spring.mybatis.entity.Dept;
@MyBatisRepository
public interface DeptDao {
    Dept findDeptById(int id);

    Dept findDeptById2(int id);
}
