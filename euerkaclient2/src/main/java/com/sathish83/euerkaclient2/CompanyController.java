package com.sathish83.euerkaclient2;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.discovery.EurekaClient;
import com.sathish83.eurekaclient2.model.Company;

@RestController
@RequestMapping(value="api/v1/eurakaclient2")
public class CompanyController {

	   @Autowired
	   @Lazy
	   EurekaClient eurekaClient;
	   
	   @Value("${spring.application.name}")
	   private String appName;

	@GetMapping(value="/companydetails")
	public List<Company> getCompanyDetails() {
		
		List<Company> companyDetails = new ArrayList<Company>();
		Company cy = new Company();
		cy.setLocation("Bengaluru");
		cy.setName("GE-HealthCare");
		companyDetails.add(cy);
		return companyDetails;
	
	}

	@GetMapping(value="/getjobseekerfromcompany")
	public String testEurekaClient2() {
		return "Eureka JobSeeker Name is"+""+eurekaClient.getApplication("eureka.client1").getName() + "#####"+
		       "Eureka JobSeeker HostName is"+""+eurekaClient.getApplication("eureka.client1").getInstances().get(0).getHostName()+"####"+
		       "Eureka JobSeeker Port is"+""+eurekaClient.getApplication("eureka.client1").getInstances().get(0).getPort();
	}
	
}
