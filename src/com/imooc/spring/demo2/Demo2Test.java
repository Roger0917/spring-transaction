package com.imooc.spring.demo2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * 2 * @Author: Roger
 * 3 * @Date: 2018/7/24 0024 0:50
 * 4  Spring声明式事务管理测试 方法一
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext2.xml")
public class Demo2Test {

    /**
     * 注入代理类:因为代理类通过aop对service增强
     */
    //@Autowired
    @Resource(name = "accountServiceProxy")
    private AccountService accountService;


    @Test
    public void demo2(){
        accountService.transfer("aaa","bbb",200d);
    }

}
