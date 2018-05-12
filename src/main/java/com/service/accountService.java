package com.service;

import com.mapper.accountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public interface accountService {

   public  void transfer(String in, String out, double money);
}
