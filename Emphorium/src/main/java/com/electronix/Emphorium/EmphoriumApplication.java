package com.electronix.Emphorium;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.electronix.Emphorium", "com.electronix.Emphorium.service"})
public class EmphoriumApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmphoriumApplication.class, args);
	}

}
