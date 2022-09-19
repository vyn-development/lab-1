package com.example.demo.controllers;

import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entities.Person;

@Controller
@RequestMapping("/team")
public class TeamController {
	private HashMap<String, Person> team = new HashMap<String, Person>();
	
	public TeamController() {
		team.put("Yaroslav", new Person("Yaroslav", "", ""));
		team.put("Vladyslav", new Person("Vladyslav", "", ""));
		team.put("Anastasia", new Person("Anastasia", "", ""));
	}

	@GetMapping
	public String getTeamPage(Model model) {
		model.addAttribute("team", team.values().toArray());
		
		return "team";
	}
	
	@GetMapping("/{member}")
	public String getMemberPage(@PathVariable("member") String member, Model model) {
		if (!team.containsKey(member)) {
			return "redirect:/team";
		}
		
		model.addAttribute("member", team.get(member));

	    return "member";
	}
}
