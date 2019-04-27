package com.syf.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.syf.study.entity.User;
@Controller
@RequestMapping("/user")
public class RequestController {

	//ֻ��GET
	@RequestMapping(value="/find",method=RequestMethod.GET)
	public String find(ModelMap model) {
		System.out.println("find***********");
		return "savePage";
	}
	//ֻ��POST
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String save(ModelMap model) {
		System.out.println("save***********");
		return "savePage";
	}
	//ֻ��POST
	@RequestMapping(value="/update",method=RequestMethod.POST)
	public String update(ModelMap model) {
		System.out.println("update***********");
		return "savePage";
	}
	//����
	@RequestMapping("/delete")
	public String delete(ModelMap model) {
		System.out.println("delete***********");
		return "savePage";
	}
}
