package com.mw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mw.model.Result;

@Controller
public class ResultController {
	@PostMapping("/calc")
	public String count(@RequestParam Double a, @RequestParam Double b, @RequestParam String operation, Model model, @ModelAttribute Result resultObj) {
		model.addAttribute("resultObj", resultObj);
		switch (operation) {
		case "+":
			resultObj.setDescription("Addiction result: ");
			resultObj.setResult(a + b);
			break;
		case "-":
			resultObj.setDescription("Substraction result: ");
			resultObj.setResult(a - b);
			break;
		case "*":
			resultObj.setDescription("Multiplication result: ");
			resultObj.setResult(a * b);
			break;
		case "/":
			resultObj.setDescription("Division result: ");
			resultObj.setResult(a / b);
			break;
		}

		return "success_result";

	}
}
