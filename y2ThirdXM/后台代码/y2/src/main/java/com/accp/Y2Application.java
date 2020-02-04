package com.accp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.accp.mapper")
public class Y2Application {

	public static void main(String[] args) {
		SpringApplication.run(Y2Application.class, args);
	}

}
