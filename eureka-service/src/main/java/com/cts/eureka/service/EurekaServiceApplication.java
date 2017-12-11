package com.cts.eureka.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.cts.eureka.service.filter.CORSFilter;

@EnableZuulProxy
@EnableEurekaServer
@SpringBootApplication
public class EurekaServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServiceApplication.class, args);
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

