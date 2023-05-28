package com.dev.scm.controller;

import com.dev.scm.entities.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dev.scm.dao.UserRepository;

@Controller
public class HomeController {

	@Autowired
	private UserRepository userRepo;

	@GetMapping("/test")
	@ResponseBody
	public String test() {

//		User user = new User();
//		user.setName("Devendra");
//		user.setEmail("dev@gmail.com");
//		
//		userRepo.save(user);

		return "Working";
	}

	@GetMapping("/home")
	public String home(Model model) {
		model.addAttribute("title", "Home - Smart Contact Manager");
		return "home";
	}
	
	@GetMapping("/about")
	public String about(Model model) {
		model.addAttribute("title", "About - Smart Contact Manager");
		return "about";
	}
	
	@GetMapping("/signup")
	public String signup(Model model) {
		model.addAttribute("title", "Registration - Smart Contact Manager");
		return "signup";
	}
	
	@GetMapping("/login")
	public String login(Model model) {
		model.addAttribute("title", "Login - Smart Contact Manager");
		return "login";
	}

}
