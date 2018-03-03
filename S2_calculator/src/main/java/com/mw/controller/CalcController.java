package com.mw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalcController {

	@GetMapping("/")
	public String calc() {
		return "calc";
	}

	@PostMapping("/")
	public String count(@RequestParam Double a, @RequestParam Double b, String operation) {
		String description = "";
		Double result = 0.0d;
		
			switch (operation) {
			case "+":
				description = "Addiction";
				result = a + b;
				break;
			case "-":
				description = "Substraction";
				result = a - b;
				break;
			case "*":
				description = "Multiplication";
				result = a * b;
				break;
			case "/":
				description = "Division";
				result = a / b;
				break;
			}
		
			System.out.println(description + " result: " + result);
			return "result";
		
			
	}
}
