package com.yed.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yed.service.UserService;
import com.yed.vo.User;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	@RequestMapping("/toadd")
	public String toadd() {
		return "add";
	}
	
	@RequestMapping("/add")
	public String insert(User user) {
		System.out.println("execute add opteration;user=" + user);
		System.out.println("execute add opteration;user=" + user);
		System.out.println("execute add opteration;user=" + user);
		System.out.println("execute add opteration;user=" + user);
		System.out.println("execute add opteration;user=" + user);
		System.out.println("execute add opteration;user=" + user);
		userService.insert(user);
		return "forward:testlist";
	}
	
	@RequestMapping("/testlist")
	public String list(ModelMap map) {
		System.out.println("has been here in list");
		map.addAttribute("list", userService.list());
		return "list";
	}
	
	@RequestMapping("/delete")
	public String delete(Long id) {
		System.out.println("execute delete opteration;id=" + id);
		userService.delete(id);	 
		 return "forward:testlist";
	}
	
	
}
