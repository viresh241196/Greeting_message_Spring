package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.IGreetingService;

@RestController
@RequestMapping("/greetings")
public class GreetingController {
//	private static final String template ="Hello, %s!";
//	private static final AtomicLong counter =new AtomicLong();

	@Autowired
	private IGreetingService greetingService;
	
	@GetMapping("") 
	public Greeting greeting(@RequestParam(value="name", defaultValue="World")String name) {
		User user = new User();
		user.setFirstName(name);
		return greetingService.addGreeting(user);
				
	}
}
