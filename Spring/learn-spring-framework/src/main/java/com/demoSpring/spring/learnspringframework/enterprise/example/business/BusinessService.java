
package com.demoSpring.spring.learnspringframework.enterprise.example.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.demoSpring.spring.learnspringframework.enterprise.example.data.DataService;

@Controller
public class BusinessService {
	
	private DataService dataService;
	
	@Autowired
	public long calculateSum() {
		List<Integer> data = dataService.getData();
		return data.stream().reduce(Integer::sum).get();
	}
}


