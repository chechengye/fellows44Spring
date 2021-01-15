package com.weichuang.aop.impl;

import com.weichuang.aop.OrderService;
import com.weichuang.pojo.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {
    @Override
    public void addOrder() {
        System.out.println("添加订单方法");
        //int i = 1/0;
    }

    @Override
    public Order getOrderById(int id) {
        System.out.println("查询订单方法");
        return null;
    }

    @Override
    public void deleteOrderById(int id) {
        System.out.println("删除订单方法");
    }

    @Override
    public void updateOrderById() {
        System.out.println("更新订单方法");
    }
}
