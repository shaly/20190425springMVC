package com.syf.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
	

	//==================带参===============
	@RequestMapping(value="/params",params="uid")//get,post请求都行，要求参数必须在，可为空
	public String params(@RequestParam("uid")Integer uid) {
		System.out.println("params***********uid="+uid);
		return "savePage";
	}
	@RequestMapping(value="/params2",params= {"uid","userName","age"})//get,post请求都行，要求所有参数必须在，可为空
	public String params2(@RequestParam("uid")Integer uid,
			@RequestParam("userName")String userName,
			@RequestParam("age")Integer age) {
		System.out.println("params2***********uid="+uid);
		System.out.println("params2***********userName="+userName);
		System.out.println("params2***********age="+age);
		return "savePage";
	}
}
