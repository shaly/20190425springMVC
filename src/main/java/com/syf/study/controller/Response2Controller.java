package com.syf.study.controller;

import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.syf.study.entity.User;
import com.syf.study.entity.UserXml;

@Controller
public class Response2Controller {
	//http://localhost:8080/springMVC/responseEntityXml.xml?account=11   //����xml��ʽ,����xml���͵�ʵ�������Ҫ��@XmlRootElement���ע��
	//http://localhost:8080/springMVC/responseEntityXml.json?account=11  //����json��ʽ
	@RequestMapping("/responseEntityXml")
	public ResponseEntity<UserXml> responseEntityXml(UserXml u) {
		return new ResponseEntity<UserXml>(u,HttpStatus.OK);
	}
	
	
}

