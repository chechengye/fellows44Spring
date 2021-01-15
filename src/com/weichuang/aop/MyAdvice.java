package com.weichuang.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * 自定义的通知类
 */
//注解版配置aop
@Aspect
public class MyAdvice {
    @Pointcut("execution(* com.weichuang.aop.impl.*ServiceImpl.*(..))")
    public void pc(){}

    @Before(value = "MyAdvice.pc()")
    public void before(){
        System.out.println("前置通知");
    }

    @AfterReturning(value = "MyAdvice.pc()")
    public void after(){
        System.out.println("后置通知");
    }

    public void throwing(){
        System.out.println("异常通知");
    }

    public void finalAfter(){
        //try{}finally{}块
        System.out.println("最终通知");
    }

    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("前环绕通知");
        Object o = pjp.proceed();
        System.out.println("后环绕通知");
        return o;
    }
}
