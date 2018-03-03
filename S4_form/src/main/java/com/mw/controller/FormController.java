package com.mw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.mw.model.Form;

@Controller
public class FormController {

	@PostMapping("/add")
	public String index(@ModelAttribute Form form) {
		if (checkNoEmpty(form)) {
			return "success";
		} else {
			return "redirect:sorry";
		}
	}

	@GetMapping("/sorry")
	public String error() {
		return "errorMessage";
	}

	private boolean checkNoEmpty(Form form) {
		if (form.getName().length() > 0 && form.getLast().length() > 0 && form.getAge() > 0
				&& form.getEmail().length() > 0)
			return true;
		else
			return false;

	}

}
