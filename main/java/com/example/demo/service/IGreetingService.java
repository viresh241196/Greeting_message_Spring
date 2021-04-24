package com.example.demo.service;

import com.example.demo.controller.Greeting;
import com.example.demo.controller.User;

public interface IGreetingService {
	Greeting addGreeting(User user);
	Greeting getGreetingById(long Id);

}
