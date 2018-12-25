package com.nero.loverpool;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.nero.loverpool.dao")
public class LoverpoolApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoverpoolApplication.class, args);
	}

}

