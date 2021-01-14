package com.weichuang.test;

import com.weichuang.aop.JdkFactory;
import com.weichuang.aop.OrderService;
import com.weichuang.aop.impl.OrderServiceImpl;
import com.weichuang.pojo.Car;
import com.weichuang.pojo.CollectionDemo;
import com.weichuang.pojo.Person;
import com.weichuang.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试类
 * 面试题：
 * 1、多次获取Spring中的对象，bean名称一致的话是同一个对象吗？
 * 2、在Spring容器中配置的对象何时被初始化？
 *
 */
public class QuickTest {

    @Test
    public void testFn(){
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
       // User user = (User)ac.getBean("a1");//即可以取name的key也可以取id的key
        /*User user1 = (User)ac.getBean("b1");
        System.out.println(user == user1);*/
        User user1 = (User)ac.getBean("b1");
        ac.close();
    }

    /**
     * 测试注入
     */
    @Test
    public void testFn1(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:com/weichuang/injection/injection.xml");
        Person person = (Person)ac.getBean("p3");
        System.out.println(person);
    }

    /**
     * 测试复杂类型注入
     */
    @Test
    public void testFn2(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:com/weichuang/injection/injection.xml");
        CollectionDemo cd = (CollectionDemo)ac.getBean("collectionDemo");
        System.out.println(cd);
    }

    /**
     * 其它方式创建对象
     */
    @Test
    public void testFn3(){
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        User fUser = (User)ac.getBean("f2_user");
        System.out.println(fUser);
    }

    /**
     * 测试注解
     */
    @Test
    public void testFn4(){
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("com/weichuang/anotation/anotation.xml");
        Car car1 = (Car)ac.getBean("car");
       /* Car car2 = (Car)ac.getBean("car");
        System.out.println(car1 == car2);*/
        System.out.println(car1);
    }


}

