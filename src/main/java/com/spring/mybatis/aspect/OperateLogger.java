package com.spring.mybatis.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 用于记录日志方面的组件
 */
@Component
@Aspect
public class OperateLogger {

    /**
     * 前置通知，后置通知，最终通知使用的方法
     */
    @Before("within(com.spring.mybatis.controller..*)")
    public void log() {
        // 记录日志
        System.out.println("-->记录用户操作信息");
    }

    /**
     * 环绕通知使用的方法
     */
    @Around("within(com.spring.mybatis.controller..*)")
    public Object log2( ProceedingJoinPoint joinPoint) throws Throwable {
        // 目标组件的类名
        String className = joinPoint.getTarget().getClass().getName();
        // 调用的方法名
        String method = joinPoint.getSignature().getName();
        //  当前系统时间
        String date = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date());
        // 拼日志信息
        String msg = "-->用户在" + date + ", 执行了" + className + "." + method + "()";
        // 记录日志
        System.out.println(msg);
        // 执行目标组件的方法
        Object obj = joinPoint.proceed();
        // 在调用目标组件业务方法后也可以做一些业务处理
        System.out.println("-->调用目标组件业务方法后...");
        return  obj;
    }
}
