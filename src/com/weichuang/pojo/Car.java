package com.weichuang.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

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
    /**
     * @Autowired ： 最重要的注解之一，自动装配/自动注入
     *          1、会默认从Spring容器中寻找类首字母小写的 bean。
     *          2、若是有多个bean指向同一个对象的时候，若没有类首字母小写的bean的配置就会报错
     *          3、若果整个容器中只存在一个类的bean，那不管名称是不是类首字母小写都可以读取到
     *          4、若是有多个bean指向同一个对象的时候，若没有类首字母小写的bean的配置。此时若还想获取相应的对象需要与@Qualifier配合使用（定向指定）。
     * @Resource(name = "tire1")：相当于@Autowired 与 @Qualifier组合使用
     */
    /*@Autowired
    @Qualifier(value = "tire2")*/
    @Resource(name = "tire1")
    private Tire tire;//轮胎

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

    public Tire getTire() {
        return tire;
    }

    public void setTire(Tire tire) {
        this.tire = tire;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", tire=" + tire +
                '}';
    }
}
