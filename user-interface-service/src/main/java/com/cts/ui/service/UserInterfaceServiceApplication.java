package com.cts.ui.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
public class UserInterfaceServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserInterfaceServiceApplication.class, args);
	}

}
