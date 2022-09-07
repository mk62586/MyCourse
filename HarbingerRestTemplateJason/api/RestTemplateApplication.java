package com.harbinger.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.harbinger.api.dto.Employe;
import com.harbinger.api.payload.EmployeePayload;

@SpringBootApplication
public class RestTemplateApplication {

	
	
	public static void main(String[] args) {
		SpringApplication.run(RestTemplateApplication.class, args);
	}
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
