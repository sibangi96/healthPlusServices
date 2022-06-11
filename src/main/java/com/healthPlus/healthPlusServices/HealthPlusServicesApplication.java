package com.healthPlus.healthPlusServices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.healthPlus.healthPlusServices.repository")
@SpringBootApplication
public class HealthPlusServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(HealthPlusServicesApplication.class, args);
	}

}
