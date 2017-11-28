package com.cts.room.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.cts.room.service.repository")
@SpringBootApplication
public class RoomServiceApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(RoomServiceApplication.class,args);
		
	}

}
