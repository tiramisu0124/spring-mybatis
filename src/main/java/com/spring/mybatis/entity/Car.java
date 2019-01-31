package com.spring.mybatis.entity;

public class Car extends Vehicle {
    private int doorSize;

    public int getDoorSize() {
        return doorSize;
    }

    public void setDoorSize( int doorSize ) {
        this.doorSize = doorSize;
    }
}
