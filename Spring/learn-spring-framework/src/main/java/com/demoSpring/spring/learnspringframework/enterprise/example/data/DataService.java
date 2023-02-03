package com.demoSpring.spring.learnspringframework.enterprise.example.data;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class DataService {
	
	@Autowired
	public List<Integer> getData(){
		return Arrays.asList(10,20,30,40);
	}
}