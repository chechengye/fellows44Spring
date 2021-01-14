package com.weichuang.pojo;

import java.io.Serializable;

public class Order implements Serializable {
    private String ono;
    private String createTime;
    private String amount;

    public String getOno() {
        return ono;
    }

    public void setOno(String ono) {
        this.ono = ono;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
}
