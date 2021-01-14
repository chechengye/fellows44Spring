package com.weichuang.junit;


import com.weichuang.aop.JdkFactory;
import com.weichuang.aop.OrderService;
import com.weichuang.aop.impl.OrderServiceImpl;
import com.weichuang.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class JunitTest {


    @Autowired
    User user;

    @Autowired
    OrderService os;

    @Test
    public void testFn(){
        System.out.println(user);
    }


    /**
     * 测试JDK动态代理
     */
    @Test
    public void testFn5(){
        //OrderService os = new OrderServiceImpl();
        JdkFactory jf = new JdkFactory(os);
        OrderService pos = jf.getProxyOrderService();
        pos.addOrder();
    }
}
