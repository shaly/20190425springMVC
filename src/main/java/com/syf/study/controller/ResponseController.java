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

@RestController //@RestController 只有在springMVC 4.3版本以上才有
public class ResponseController {

	@RequestMapping("/test1")
	public User test1(User u) {
		return u;
	}

}

