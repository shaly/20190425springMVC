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

	//只能GET
	@RequestMapping(value="/find",method=RequestMethod.GET)
	public String find( ) {
		System.out.println("find***********");
		return "savePage";
	}
	//只能POST
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String save( ) {
		System.out.println("save***********");
		return "savePage";
	}
	//只能POST
	@RequestMapping(value="/update",method=RequestMethod.POST)
	public String update( ) {
		System.out.println("update***********");
		return "savePage";
	}
	//都行
	@RequestMapping("/delete")
	public String delete( ) {
		System.out.println("delete***********");
		return "savePage";
	}
	
	
}
