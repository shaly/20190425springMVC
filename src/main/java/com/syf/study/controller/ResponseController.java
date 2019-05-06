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

@RestController //@RestController ֻ����springMVC 4.3�汾���ϲ���
public class ResponseController {

	@RequestMapping("/test1")
	public User test1(User u) {
		return u;
	}

	//http://localhost:8080/springMVC/testXml.xml   //����xml��ʽ
	//http://localhost:8080/springMVC/testXml.json  //����json��ʽ
	@RequestMapping("/testXml")
	public UserXml test1(UserXml u) {
		return u;
	}
}

