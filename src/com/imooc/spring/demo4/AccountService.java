package com.imooc.spring.demo4;

/**
 * @Author: Roger
 * @Date: 2018/7/23 17:19
 * 转账案例的业务层接口
 */
public interface AccountService {
    /**
     *
     * @param out：转出账号
     * @param in：转入账号
     * @param money：交易金额
     */
    public void transfer(String out, String in, Double money);

}
