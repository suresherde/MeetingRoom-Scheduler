package com.cts.room.service;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.cts.room.service.filter.CORSFilter;

@EnableJpaRepositories(basePackages = "com.cts.room.service.repository")
@SpringBootApplication
@EnableDiscoveryClient
public class RoomServiceApplication {
	
	 private static final Logger logger = LogManager.getLogger(RoomServiceApplication.class);

	public static void main(String[] args) {		
		SpringApplication.run(RoomServiceApplication.class,args);
		
	}

	 @Bean
	    public static FilterRegistrationBean corsFilterRegistration() {
	        FilterRegistrationBean registrationBean =
	                new FilterRegistrationBean(new CORSFilter());
	        registrationBean.setName("CORS Filter");
	        registrationBean.addUrlPatterns("/*");
	        registrationBean.setOrder(1);
	        return registrationBean;
	    }
}
