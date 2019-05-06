package com.syf.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.syf.study.entity.User;

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

}

