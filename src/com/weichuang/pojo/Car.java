package com.weichuang.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 *  将一个对象放于Spring容器中。会默认将类的首字母小写作为名称
 * @Component ：作用于pojo、vo、domain、dto等
 * @Repository : 作用于 dao层
 * @Service ： 作用于service层
 * @Controller ： 作用于web/controller层
 */
@Component
@Scope(value = "prototype")
public class Car {

    //属性注入：破坏了封装性
    //@Value("劳斯莱斯")
    private String name;
    //@Value("金黄色")
    private String color;

    public Car() {}

    public Car(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }
    //set方式注入
    @Value("劳斯莱斯")
    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }
    @Value("红色")
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
