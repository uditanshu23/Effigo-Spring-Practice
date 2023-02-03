package com.demoSpring.spring.learnspringframework.enterprise.example.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.demoSpring.spring.learnspringframework.enterprise.example.business.BusinessService;

@Controller
public class MyWebController {
	
	@Autowired
	private BusinessService businessService;

	public MyWebController(BusinessService businessService) {
		super();
		System.out.println("Contructor Injection");
		this.businessService = businessService;
		
	}
	public long returnValueFromBusinessService() {
		return businessService.calculateSum();
	}
}