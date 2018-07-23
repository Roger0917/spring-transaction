package com.imooc.spring.demo1;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 * @Author: Roger
 * @Date: 2018/7/23 17:44
 */
public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {
    public void outMoney(String out, Double money) {
        String sql = "update account set money = money - ? where name = ?";
        this.getJdbcTemplate().update(sql,money,out);
    }

    public void inMoney(String in, Double money) {

    }
}