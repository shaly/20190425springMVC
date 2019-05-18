package com.syf.study.controller;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.DispatcherServlet;

@Controller
@RequestMapping("/err")
public class ErroController {
	


	@RequestMapping("/classError")
	public String classError() {
		System.out.println("********classError"); 
		return "/error/main";
	}
	

	@RequestMapping("/makeErr")
	public String makeErr() {
		System.out.println("********makeErr1"); 
		int i=1/0; 
		System.out.println("********makeErr2"); 
		return "upload";
	}
	
	

	@RequestMapping("/400")
	public String error400() {
		
		return "/error/400";
	}

	@RequestMapping("/404")
	public String error404() {
		
		return "/error/404";
	}

	@RequestMapping("/500")
	public String error500() {
		
		return "/error/500";
	}
}
