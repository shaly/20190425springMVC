package com.syf.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.syf.study.entity.User;
@Controller
@RequestMapping("/user")
public class RequestController {

	//ֻ��GET
	@RequestMapping(value="/find",method=RequestMethod.GET)
	public String find( ) {
		System.out.println("find***********");
		return "savePage";
	}
	//ֻ��POST
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String save( ) {
		System.out.println("save***********");
		return "savePage";
	}
	//ֻ��POST
	@RequestMapping(value="/update",method=RequestMethod.POST)
	public String update( ) {
		System.out.println("update***********");
		return "savePage";
	}
	//����
	@RequestMapping("/delete")
	public String delete( ) {
		System.out.println("delete***********");
		return "savePage";
	}
	

	//==================����===============
	@RequestMapping(value="/params",params="uid")//get,post�����У�Ҫ����������ڣ���Ϊ��
	public String params(@RequestParam("uid")Integer uid) {
		System.out.println("params***********uid="+uid);
		return "savePage";
	}
	@RequestMapping(path="/params2",params= {"uid","userName","age"})//get,post�����У�Ҫ�����в��������ڣ���Ϊ��
	public String params2(@RequestParam("uid")Integer uid,
			@RequestParam("userName")String userName,
			@RequestParam("age")Integer age) {
		System.out.println("params2***********uid="+uid);
		System.out.println("params2***********userName="+userName);
		System.out.println("params2***********age="+age);
		return "savePage";
	}
	//==================ͨ��·��===============

	//ͨ�䣺query123��querya��queryb�ȵ�
	@RequestMapping("/query*")
	public String query1( ) {
		System.out.println("query1***********");
		return "savePage";
	}
	//ͨ�䣺query2,�˵�ַ���롰/query*����ͻ���������query2�����˷�������/query*��ֻ�ǲ�����ʱ����ƥ��
	@RequestMapping("/query2")
	public String query2( ) {
		System.out.println("query2***********");
		return "savePage";
	}
	//ͨ�䣺query/uid?id=1��query/123/uid��query/a/uid��query/b/uid�ȵ�
	@RequestMapping(value="/query/**/uid",params="id")
	public String query3(@RequestParam("id")Integer id ) {
		System.out.println("query3***********");
		return "savePage";
	}
}
