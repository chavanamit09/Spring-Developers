package com.example.School_crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@EnableJpaRepositories(basePackages = "com.example.repository")
@EntityScan(basePackages = "com.example.entity")
@SpringBootApplication(scanBasePackages = "com.example.controller")
public class SchoolCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchoolCrudApplication.class, args);
	}

}
