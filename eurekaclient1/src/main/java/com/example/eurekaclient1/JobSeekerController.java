package com.example.eurekaclient1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.discovery.EurekaClient;

@RestController
@RequestMapping(value="api/v1/eurekaclient1")
public class JobSeekerController {
	
	@Autowired
	   @Lazy
	   EurekaClient eurekaClient;
	   
		@GetMapping(value="/getcompanyfromjobseeker")
		public String testEurekaClient2() {
			return "Eureka JobSeeker Name is"+""+eurekaClient.getApplication("eureka.client2").getName() + "#####"+
			       "Eureka JobSeeker HostName is"+""+eurekaClient.getApplication("eureka.client2").getInstances().get(0).getHostName()+"####"+
			       "Eureka JobSeeker Port is"+""+eurekaClient.getApplication("eureka.client2").getInstances().get(0).getPort();
		}

}
