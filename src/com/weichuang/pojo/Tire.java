package com.weichuang.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component(value = "tire1")
public class Tire implements Serializable{

    @Value("米其林")
    private String brand;//品牌
    @Value("142")
    private int height;//高度
    @Value("142")
    private int weight; //宽度

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Tire{" +
                "brand='" + brand + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
