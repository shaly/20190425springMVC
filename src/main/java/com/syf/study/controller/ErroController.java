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

@Controller
@RequestMapping("/err")
public class ErroController {

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
