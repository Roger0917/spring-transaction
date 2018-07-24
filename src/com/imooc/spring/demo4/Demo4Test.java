package com.imooc.spring.demo4;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @Author: Roger
 * @Date: 2018/7/24 16:11
 * Spring声明式事务管理: 基于注解
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext4.xml")
public class Demo4Test {

    @Resource(name = "accountService")
    private AccountService accountService;

    @Test
    public void demo4(){
        accountService.transfer("aaa","bbb",200d);
    }

}
