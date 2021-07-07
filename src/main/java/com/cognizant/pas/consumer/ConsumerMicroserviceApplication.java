package com.cognizant.pas.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
@Configuration
@EnableFeignClients
public class ConsumerMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumerMicroserviceApplication.class, args);
	}

}
