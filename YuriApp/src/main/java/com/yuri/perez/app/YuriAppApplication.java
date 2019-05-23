package com.yuri.perez.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.yuri.perez.app")
public class YuriAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(YuriAppApplication.class, args);
	}

}
