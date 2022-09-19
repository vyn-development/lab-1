package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TeamInfoController {
	
	@GetMapping("/teamInfo")
	//@ResponseBody
	public String teamInfo() {
		return "C:\\Users\\User\\Spring_Workspace\\lab-1\\MySpringWebHelloWorld\\src\\main\\resources\\static\\index.html";
	}
}
