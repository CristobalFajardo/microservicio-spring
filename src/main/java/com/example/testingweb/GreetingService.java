package com.example.testingweb;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
	public String greet() {
		String mensaje = "Hello, World";
		return mensaje;
	}
}
