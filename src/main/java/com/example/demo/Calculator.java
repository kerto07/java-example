package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Calculator {

	public int sum(int first, int second) {
		return first + second;
	}
	
}
