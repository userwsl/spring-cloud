package com.eurka.service.surkaserivice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient 
@SpringBootApplication
public class SurkaSeriviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SurkaSeriviceApplication.class, args);
	}
}
