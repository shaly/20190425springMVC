package com.syf.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class OtherApplyController {
	//http://localhost:8080/springMVC/save/user  //POST请求
	//@PostMapping("/save/user")等价于@RequestMapping(value="/save/user",method=RequestMethod.POST)
	@PostMapping("/save/user")
	@ResponseBody
	public String testPost() {
		
		return "Success";
	}
	

	//http://localhost:8080/springMVC/get/user  //GET请求
	//@PostMapping("/save/user")等价于@RequestMapping(value="/save/user",method=RequestMethod.POST)
	@GetMapping("/get/user")
	@ResponseBody
	public String testGet() {
		
		return "Success";
	}

	@GetMapping("/test/redirect")//重定向，地址改变，reqeust会话改变
	public String testRedirect() {
		
		return "redirect:/index";
	}
	
	@GetMapping("/test/forward")//转发
	public String testForward() {
		
		return "forward:/index";
	}

	@GetMapping("/test/redirect1")//重定向，地址改变，reqeust会话改变
	public ModelAndView testRedirect1() {
		ModelAndView m=new ModelAndView();
		m.setViewName("redirect:/index");
		return m;
	}
	
	@GetMapping("/test/forward1")//转发
	public ModelAndView testForward1() {
		ModelAndView m=new ModelAndView();
		m.setViewName("forward:/index");
		return m;
	}
}
