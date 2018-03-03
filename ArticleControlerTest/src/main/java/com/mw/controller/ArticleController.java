package com.mw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.mw.model.Article;

@Controller
public class ArticleController {

	@PostMapping("/add")
	public String addArticle(@ModelAttribute Article formArticle, Model model) {
		if (checkNotEmpty(formArticle)) {
			model.addAttribute("formArticle", formArticle);
			return "success";
		} else
			return "redirect:sorry";
	}

	@GetMapping("/sorry")
	public String error() {
		return "errorMessage";
	}

	private boolean checkNotEmpty(Article formArticle) {
		return (formArticle.getTitle().length() > 0 && formArticle.getContent().length() > 0);
	}
}
