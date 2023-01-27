package com.surya.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/")
public class UserController {
@GetMapping("/test")
	public String tets()
{
	System.out.println("df");
	return "test";
}
}
