package com.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.entity.UserInfo;
import com.test.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService service;
	
	@RequestMapping("/queryAll")
	public String queryAll(Model model){
	
		List<UserInfo> userList=service.queryAll();
		model.addAttribute("userList",userList);
		return "index";
	}
}
