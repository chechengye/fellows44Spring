package com.weichuang.tx.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class AccountDao {

    @Autowired
    JdbcTemplate jt;
    //加钱
    public void addMoney(int id , int money){
        jt.update("update t_user set money = money + ? where id = ?" , money , id);
    }
    //减钱
    public void reduceMoney(int id , int money){
        jt.update("update t_user set money = money - ? where id = ?" , money , id);
    }
}
