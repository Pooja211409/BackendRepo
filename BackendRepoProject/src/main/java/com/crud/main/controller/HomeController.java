package com.crud.main.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.persistence.Entity;

@RestController
public class HomeController {
	@PostMapping("/SaveData")
	public String SaveData(@RequestBody Student s)
	{
		System.out.println("WelCome");
		return "Java Program";
	}

}
