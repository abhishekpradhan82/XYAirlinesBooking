package com.xyairline.booking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class XYAirlinesBookingApplication {
	//Spring Boot Application
	public static void main(String[] args) {
		SpringApplication.run(XYAirlinesBookingApplication.class, args);
	}

}
