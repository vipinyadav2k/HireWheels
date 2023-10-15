package org.ncu.hirewheels.web;


import java.security.Principal;

import org.ncu.hirewheels.service.User1Service;
import org.ncu.hirewheels.web.dto.User1Dto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
public class User1Controller {
	
	@Autowired
	UserDetailsService userDetailsService;
	
	@Autowired
	private User1Service userService;
	
	
	@GetMapping("/registration")
	public String getRegistrationPage(@ModelAttribute("user") User1Dto userDto) {
		return "register";
	}
	
	@PostMapping("/registration")
	public String saveUser(@ModelAttribute("user") User1Dto userDto, Model model) {
		userService.save(userDto);
		model.addAttribute("message", "Registered Successfuly!");
		return "register";
	}
	
	@GetMapping("/login")
	public String login() {
		return "login1";
	}
	
	@GetMapping("user-page")
	public String userPage (Model model, Principal principal) {
		UserDetails userDetails = userDetailsService.loadUserByUsername(principal.getName());
		model.addAttribute("user", userDetails);
		return "user";
	}
	
	@GetMapping("admin-page")
	public String adminPage (Model model, Principal principal) {
		UserDetails userDetails = userDetailsService.loadUserByUsername(principal.getName());
		model.addAttribute("user", userDetails);
		return "index";
	}

}