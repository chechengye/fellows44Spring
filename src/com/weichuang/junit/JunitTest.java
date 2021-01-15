package com.weichuang.junit;


import com.weichuang.aop.CglibFactory;
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
        System.out.println("------------");
        System.out.println(pos instanceof OrderServiceImpl);//不是父子关系，兄弟关系接口式的动态代理
    }

    /**
     * 测试CGLIB动态代理
     */
    @Test
    public void testFn6(){
        CglibFactory cf = new CglibFactory();
        OrderService pos = cf.getProxyOrderService();
        pos.updateOrderById();
        System.out.println("------------");
        System.out.println(pos instanceof OrderServiceImpl);//父子关系，继承式的动态代理
    }


}
