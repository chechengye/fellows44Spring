package com.weichuang.jdbc;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.weichuang.jdbc.pojo.User;
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
@ContextConfiguration("classpath:com/weichuang/jdbc/jdbcConfig.xml")
public class JunitTestJdbc {


    @Autowired
    JdbcTemplate jt;
    @Test
    public void testFn(){
        //1、需要建立数据源
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        JdbcTemplate jt = new JdbcTemplate(dataSource);
        List<User> userList = jt.query("select * from t_user", new RowMapper<User>() {//参数式的匿名内部类

            @Override
            public User mapRow(ResultSet rs, int i) throws SQLException {
                User user = new User();
                user.setId(rs.getInt("id"));
                user.setName(rs.getString("name"));
                user.setAge(rs.getInt("age"));
                return user;
            }
        });
        System.out.println(userList);
    }

    @Test
    public void testFn2(){
        jt.update("update t_user set name = ? where id = ?" , "赵六",1);
    }
}
