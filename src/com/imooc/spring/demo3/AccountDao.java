package com.imooc.spring.demo3;

/**
 * @Author: Roger
 * @Date: 2018/7/23 17:40
 */
public interface AccountDao {

    /**
     *
     * @param out
     * @param money
     */
    public void outMoney(String out, Double money);

    public void inMoney(String in, Double money);
}
