package com.weichuang.aop;

import com.weichuang.aop.impl.OrderServiceImpl;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibFactory implements MethodInterceptor{
    /**
     * 获取代理后对象
     * @return
     */
    public OrderService getProxyOrderService(){
        Enhancer en = new Enhancer();//生成动态代理对象的对象
        en.setSuperclass(OrderServiceImpl.class);
        en.setCallback(this);//代理过程。包装/拦截的过程
        return (OrderService)en.create();//创建被代理对象/代理后对象
    }
    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("cglibg前操作");
        Object o = methodProxy.invokeSuper(obj, args);
        System.out.println("cglib后操作");
        return o;
    }
}
