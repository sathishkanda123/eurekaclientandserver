package com.sathish83.euerkaclient2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Euerkaclient2Application {

	public static void main(String[] args) {
		SpringApplication.run(Euerkaclient2Application.class, args);
	}

}
