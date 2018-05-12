package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
@MapperScan(basePackages = "com.mapper.*")
public class TranssactionApplication {

	public static void main(String[] args) {
		SpringApplication.run(TranssactionApplication.class, args);
	}
}
