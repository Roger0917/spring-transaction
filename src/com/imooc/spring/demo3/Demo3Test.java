package com.imooc.spring.demo3;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @Author: Roger
 * @Date: 2018/7/24 14:16
 * 声明式事务管理方式2: 基于AspectJ的XML方式
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext3.xml")
public class Demo3Test {

    @Resource(name = "accountService")
    private AccountService accountService;

    @Test
    public void demo3(){
        accountService.transfer("aaa","bbb",200d);
    }
}
