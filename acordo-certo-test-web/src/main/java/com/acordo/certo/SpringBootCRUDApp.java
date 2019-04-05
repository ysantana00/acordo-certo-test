package com.acordo.certo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages="acordo.certo.domain.repository")
@EntityScan("acordo.certo.domain.model")
@SpringBootApplication(scanBasePackages={"com.acordo.certo", "acordo.certo.domain.model", "acordo.certo.service"})
public class SpringBootCRUDApp {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootCRUDApp.class, args);
	}
}
