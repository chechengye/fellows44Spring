package com.weichuang.aop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:com/weichuang/aop/aopConfig.xml")
public class JunitTestAop {

    @Autowired
    OrderService os;
    @Test
    public void testFn(){
        os.addOrder();
        os.deleteOrderById(1);
    }
}
