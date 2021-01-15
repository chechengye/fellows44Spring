package com.weichuang.tx;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.weichuang.jdbc.pojo.User;
import com.weichuang.tx.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:com/weichuang/tx/txConfig.xml")
public class JunitTestTx {

    @Autowired
    AccountService accountService;

    @Test
    public void testFn(){
        accountService.saveUser(1 , 2 , 100);
    }



}
