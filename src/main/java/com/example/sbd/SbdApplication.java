package com.example.sbd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.*")
public class SbdApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbdApplication.class, args);
	}

}
