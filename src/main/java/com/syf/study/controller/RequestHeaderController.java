package com.syf.study.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestHeaderController {
	//��ȡ����ͷ��Ϣ
	//@RequestHeader("Keep-Alive")long keepalive
	//@RequestHeader("Content-Type")long keepalive
	//@RequestHeader("Content-Type")long keepalive
	//@RequestHeader("Key")String keepalive
	@GetMapping(value="/headMessage")
	public String message(@RequestHeader("Accept-Encoding")String encoding
			
			) {
	
		return encoding+"=="
		;
	}
	
}
