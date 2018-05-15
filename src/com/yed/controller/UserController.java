package com.yed.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yed.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService UserService;
	public void setUserService(UserService userService) {
		UserService = userService;
	}
	@RequestMapping("/list")
	public String list(ModelMap map) {
		map.addAttribute("list", UserService.list());
		return "list";
	}
}
