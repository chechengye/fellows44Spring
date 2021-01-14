package com.weichuang.pojo;

/**
 * 方式不推荐
 */
public class UserFactory {

    /**
     * 静态工厂创建对象
     * @return
     */
    public static User createUser(){
        return new User();
    }

    /**
     * 实例工厂创建对象
     * @return
     */
    public User createUser2(){
        return new User();
    }

}
