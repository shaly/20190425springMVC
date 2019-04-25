package com.syf.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.syf.study.entity.User;

@Controller
public class IndexController {

	@RequestMapping("/index")
	public String index() {	
		return "index";
	}
	
	@RequestMapping("/index1")
	public String index1(ModelMap model) {
		System.out.println("访问首页1***********");
		User u=new User();
		u.setAccount("1");
		u.setUsername("Jane");
		model.addAttribute("u",u);		
		return "index";
	}

	@RequestMapping("/index2")
	public ModelAndView index2() {
		System.out.println("访问首页2***********");
		ModelAndView m=new ModelAndView();
		User u=new User();
		u.setAccount("2");
		u.setUsername("Jane");
		m.addObject("u",u);	
		m.setViewName("index");
		return m;
	}
	
	@RequestMapping("/index3")
	public String index3(ModelMap model) {
		System.out.println("访问首页3***********");
		User u=new User();
		u.setAccount("3");
		u.setUsername("Jane");
		model.addAttribute("u",u);		
		return "forward:/WEB-INF/forward_page/index.jsp";
	}
	
	
}
