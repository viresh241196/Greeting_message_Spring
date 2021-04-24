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

	@Autowired
	private IGreetingService greetingService;
	
	@GetMapping("") 
	public Greeting greeting(@RequestParam(value= "firstName", defaultValue="")String first,@RequestParam(value= "lastName", defaultValue="")String last) {
		User user = new User();
		user.setFirstName(first);
		user.setLastName(last);
		return greetingService.addGreeting(user);		
	}
}
