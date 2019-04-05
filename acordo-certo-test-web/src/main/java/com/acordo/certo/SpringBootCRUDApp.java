package com.acordo.certo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;


@SpringBootApplication(scanBasePackages={"com.acordo.certo", "acordo.certo.domain.model", "acordo.certo.service"})
public class SpringBootCRUDApp {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootCRUDApp.class, args);
	}
}
