package com.serviceImple;

import com.mapper.accountMapper;
import com.service.accountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.support.TransactionTemplate;

/**
 * 转账业务
 */
@Service
public class accountServiceImple implements accountService {

    @Autowired
    private accountMapper account;

    @Autowired
    private TransactionTemplate transactionTemplate;

    @Override
    public void transfer(String in,String out,double money){
        double In=account.selectByName(in).getMoney();
        double total=In+money;
        account.In(in,total);
        double Out=account.selectByName(out).getMoney();
        total=Out-money;
        account.Out(out,total);

    }
}
