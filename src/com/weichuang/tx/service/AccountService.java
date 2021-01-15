package com.weichuang.tx.service;

import com.weichuang.tx.dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

@Service
@Transactional
public class AccountService {

    @Autowired
    AccountDao accountDao;

    @Autowired
    TransactionTemplate tt;


    public void transfer(int u1 , int u2 , int money){

        /*tt.execute(new TransactionCallbackWithoutResult() {
            @Override
            protected void doInTransactionWithoutResult(TransactionStatus transactionStatus) {
                accountDao.reduceMoney(u1 , money);//先减钱
                int i = 1/0;
                accountDao.addMoney(u2,money);//再加钱
            }
        });*/
        accountDao.reduceMoney(u1 , money);//先减钱
        int i = 1/0;
        accountDao.addMoney(u2,money);//再加钱

    }
    @Transactional(readOnly = false)
    public void saveUser(int u1 , int u2 , int money){
        accountDao.reduceMoney(u1 , money);//先减钱
        int i = 1/0;
        accountDao.addMoney(u2,money);//再加钱
    }
    @Transactional(readOnly = true)
    public void getUser(int id){

    }
}
