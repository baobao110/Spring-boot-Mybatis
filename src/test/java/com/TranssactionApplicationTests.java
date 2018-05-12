package com;

import com.controller.accountControl;
import com.mapper.accountMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@MapperScan(basePackages = "com.mapper.*")
public class TranssactionApplicationTests {

	@Autowired
	private accountMapper accountMapper;

	@Autowired
	private accountControl accountControl;

	@Test
	public void contextLoads() {
		accountControl.test();
	}

}
