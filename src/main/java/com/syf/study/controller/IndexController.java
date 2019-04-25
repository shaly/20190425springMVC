package com.syf.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.syf.study.entity.User;

@Controller
public class IndexController {
	
	
	@RequestMapping("/index")
	public String index(ModelMap model) {
		System.out.println("∑√Œ  ◊“≥***********");
		User u=new User();
		u.setAccount("123456789");
		u.setUsername("Jane");
		model.addAttribute("u",u);		
		return "index";
	}
	
}
