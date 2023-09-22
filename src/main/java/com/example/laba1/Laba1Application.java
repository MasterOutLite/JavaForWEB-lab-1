package com.example.laba1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:applicationContext.xml")
public class Laba1Application {

	public static void main(String[] args) {
		SpringApplication.run(Laba1Application.class, args);
		var t = new Home();
	}

}
