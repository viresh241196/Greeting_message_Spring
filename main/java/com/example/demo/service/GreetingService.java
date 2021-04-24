package com.example.demo.service;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.controller.Greeting;
import com.example.demo.controller.User;
import com.example.demo.repository.GreetingRepository;

@Service
public class GreetingService implements IGreetingService {
	private static final String template ="Hello, %s!";
	private static final AtomicLong counter =new AtomicLong();

	@Autowired
	private GreetingRepository greetingRepository;
	
	@Override
	public Greeting addGreeting(User user) {
		String message = String.format(template,(user.toString().isEmpty()?"Hello World":user.toString()));
		return greetingRepository.save(new Greeting(counter.incrementAndGet(),message));
	}
	
	@Override
	public Greeting getGreetingById(long id) {
		return null;
	}
}
