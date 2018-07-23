package com.imooc.spring.demo1;

import org.springframework.transaction.support.TransactionTemplate;

/**
 * @Author: Roger
 * @Date: 2018/7/23 17:39
 */
public class AccountServiceImpl implements AccountService {

    private AccountDao accountDao;
    private TransactionTemplate transactionTemplate;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
        this.transactionTemplate = transactionTemplate;
    }

    @Override
    public void transfer(String out, String in, Double money) {
        accountDao.outMoney(out,money);
        accountDao.inMoney(in,money);
    }



}
