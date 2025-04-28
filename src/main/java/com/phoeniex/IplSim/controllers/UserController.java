package com.phoeniex.IplSim.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.phoeniex.IplSim.models.User;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@GetMapping("/")
	public String user() {
		return "user";
	}
	
	@GetMapping("")
	public String blankUser() {
		return "user";
	}
	
	@GetMapping("/{name}")
	public String greetUser(Model model, @PathVariable String name) {
		User obj = new User();
		obj.setName(name);
		model.addAttribute("user", obj);
		model.addAttribute("default", false);
		return "user";
	}
}
