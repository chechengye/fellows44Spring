package com.weichuang.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * JDK动态代理
 */
public class JdkFactory implements InvocationHandler{
    private OrderService os;

    public JdkFactory(OrderService os){
        this.os = os;
    }
    public OrderService getProxyOrderService(){
        return (OrderService)Proxy.newProxyInstance(os.getClass().getClassLoader() , os.getClass().getInterfaces() , this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Jdk代理前操作");
        Object o = method.invoke(os, args);
        System.out.println("Jdk代理后操作");
        return o;
    }
}
