package com.sathish83.euerkaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EuerkaserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(EuerkaserverApplication.class, args);
	}

	
}
