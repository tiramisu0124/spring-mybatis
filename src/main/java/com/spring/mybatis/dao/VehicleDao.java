package com.spring.mybatis.dao;

import com.spring.mybatis.annotation.MyBatisRepository;
import com.spring.mybatis.entity.Vehicle;

import java.util.List;

@MyBatisRepository
public interface VehicleDao {
    List<Vehicle> findAll();
}
