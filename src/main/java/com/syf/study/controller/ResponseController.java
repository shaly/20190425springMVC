package com.syf.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.syf.study.entity.User;
import com.syf.study.entity.UserXml;

//@Controller
//public class ResponseController {
//	@RequestMapping("/test1")
//	@ResponseBody
//	public User test1(User u) {
//		return u;
//	}
//}

@RestController //@RestController 只有在springMVC 4.3版本以上才有
public class ResponseController {

	@RequestMapping("/test1")
	public User test1(User u) {
		return u;
	}

	//http://localhost:8080/springMVC/testXml.xml   //返回xml格式
	//http://localhost:8080/springMVC/testXml.json  //返回json格式
	@RequestMapping("/testXml")
	public UserXml test1(UserXml u) {
		return u;
	}
}

