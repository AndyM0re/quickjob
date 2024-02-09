package com.example.quickjobs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.quickjobs.entiry.User;
import com.example.quickjobs.repository.UserRepository;
import com.example.quickjobs.service.UserService;


@Controller
public class HomeController {
	@Autowired
	UserRepository userRopo;
	@Autowired
	UserService userSer;
	@GetMapping("home")
	public String home() {
		return "home.jsp";
	}
	@RequestMapping("login")
	public String login() {
		return "login.jsp";
	}
	@RequestMapping("sign")
	public String sign() {
		return "sign.jsp";
	}
	@RequestMapping("/getdata")
	public String getdata(User use) {
//		userRopo.save(use);
		boolean b = userSer.createOr(use);
//		return userSer.createOr(use);
//		return "home.jsp";
		if(b==true) {
			return "home.jsp";
		}
		return "sign.jsp";
	}
}
