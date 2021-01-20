package com.Narga.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.Narga.entity.Article;
import com.Narga.repository.ArticleRepository;

@Controller
public class TestController {
	
	@Autowired
	private ArticleRepository repo;
	
	@GetMapping("index")
	public String index() {
		
		
		return "index";
	}

}
