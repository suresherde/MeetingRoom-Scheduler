package com.cts.ui.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;



@SpringBootApplication
@EnableDiscoveryClient
public class UIServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UIServiceApplication.class,args);

	}

}
