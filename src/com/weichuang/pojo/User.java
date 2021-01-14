package com.weichuang.pojo;

import java.io.Serializable;

public class User implements Serializable {

    private String name;
    private int age;

    //构造方法
    public User(){
        System.out.println("无参的构造方法");
    }

    /**
     * 初始化参数的配置
     */
    public void init(){
        System.out.println("初始化方法");
    }

    /**
     * 销亡时调用的方法
     */
    public void destroy(){
        System.out.println("销毁方法");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
