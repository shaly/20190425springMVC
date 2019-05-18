package com.syf.study.controller.bussiness;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.syf.study.entity.User;

@Controller
public class LoginController {

	@GetMapping("/pageMain")
	public ModelAndView main(@RequestParam(name="account",value="account") String account
			,@RequestParam(name="username",value="username") String username) {
		
		ModelAndView m=new ModelAndView();
		User u=new User();
		u.setAccount(account);
		u.setUsername(username);
		m.addObject("u", u);
		System.out.println(m);
		m.setViewName("main");
		return m;
	}
	
	@GetMapping("/login")
	public String login() {
		
		return "login";
	}
	@ResponseBody
	@PostMapping("/logined")
	public String logined(@RequestParam(name="account",value="account") String account
			,@RequestParam(name="password",value="password") String password
			//,@RequestParam(name="code",value="code") String code
			) {
		
		
		
		
		if("123".equals(account) && "123".equals(password)) {
			return "success";
		}
		return "failed";
	}
}
