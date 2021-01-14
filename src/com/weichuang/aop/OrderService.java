package com.weichuang.aop;


import com.weichuang.pojo.Order;

public interface OrderService {

    void addOrder();
    Order getOrderById(int id);
    void deleteOrderById(int id);
    void updateOrderById();
}
