package com.imooc.spring.demo4;

import org.springframework.transaction.annotation.Transactional;

/**
 * @Author: Roger
 * @Date: 2018/7/23 17:39
 */
@Transactional
public class AccountServiceImpl implements AccountService {

    private AccountDao accountDao;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public void transfer(String out,String in,Double money) {

        accountDao.outMoney(out,money);
        int i = 1/0;
        accountDao.inMoney(in,money);
    }

}
