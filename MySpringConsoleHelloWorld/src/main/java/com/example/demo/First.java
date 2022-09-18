package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class First implements Ordered, CommandLineRunner {
	
	@Override
	public void printText() {
		System.out.println("First");
	}

	@Override
	public void run(String... args) throws Exception {
		printText();	
	}
}
