package com.cts.user.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;



@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.cts.user.service.repository")
//@EnableDiscoveryClient
public class UserManagementServiceApplication {
	private static final Logger logger = LogManager.getLogger(UserManagementServiceApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(UserManagementServiceApplication.class, args);

	}

}
