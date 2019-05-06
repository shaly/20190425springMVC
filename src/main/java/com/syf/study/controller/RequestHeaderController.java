package com.syf.study.controller;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class RequestHeaderController {
	//获取请求头信息
	//@RequestHeader("Keep-Alive")long keepalive
	//@RequestHeader("Content-Type")long keepalive
	//@RequestHeader("Content-Type")long keepalive
	//@RequestHeader("Key")String keepalive
	@GetMapping(value="/headMessage")
	@ResponseBody
	public String message(@RequestHeader("Accept-Encoding")String encoding
			
			) {
	
		return encoding+"=="
		;
	}
	
	@GetMapping(value="/http")
	public String http(
			HttpServletRequest req
			,HttpServletResponse resp
			,HttpSession session
			) {
		System.out.println("获取req,resp和session");
		req.setAttribute("username", "pageName");
		session.setAttribute("username", "sessionName");
		return "forward:/index";
	}
	

	
	@GetMapping(value="/application")
	public String application(
			HttpServletRequest req
			,HttpServletResponse resp
			) throws IOException {
		ServletContext application=req.getServletContext();
		application.setAttribute("username", application.getAttribute("Accept-Encoding"));
		return "forward:/index";
	}
}
