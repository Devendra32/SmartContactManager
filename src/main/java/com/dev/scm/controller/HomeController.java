package com.dev.scm.controller;

import com.dev.scm.entities.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

	// Home handler
	@GetMapping("/home")
	public String home(Model model) {
		model.addAttribute("title", "Home - Smart Contact Manager");
		return "home";
	}

	// About handler
	@GetMapping("/about")
	public String about(Model model) {
		model.addAttribute("title", "About - Smart Contact Manager");
		return "about";
	}

	// SignUP handler
	@GetMapping("/signup")
	public String signup(Model model) {
		model.addAttribute("title", "Registration - Smart Contact Manager");
		model.addAttribute("user", new User());

		return "signup";
	}

	// handler for registering user
	@PostMapping("/do_register")
	public String registerUser(@ModelAttribute("user") User user,
			@RequestParam(value = "agreement", defaultValue = "false") boolean agreement, Model model) {
			System.out.println("User "+user);
			System.out.println("Agreement "+agreement);
		return "signup";
	}

	// Login handler
	@GetMapping("/login")
	public String login(Model model) {
		model.addAttribute("title", "Login - Smart Contact Manager");
		return "login";
	}

}
