package com.syf.study.controller;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController//@RestController�������еķ��������첽�����������Զ�����@ResponseBody
public class ParamterController {

	
	@RequestMapping(value="/p1",params="id")
	public String p1(@RequestParam("id")Integer id ) {//�����ش�@RequestParam��requiredĬ��Ϊtrue
		System.out.println("p1***********id="+id);
		return "savePageid="+id;
	}

	@RequestMapping(value="/p2",params= {"id","name"})
	public String p2(@RequestParam("id")Integer id
			,@RequestParam("name")String name) {//�����ش�@RequestParam��requiredĬ��Ϊtrue
		System.out.println("p2***********id="+id);
		System.out.println("p2***********name="+name);
		return "savePageid="+id+"name="+name;
	}

	@RequestMapping(value="/p3")
	public String p3(@RequestParam(value="id")Integer id ) {//�����ش�@RequestParam��requiredĬ��Ϊtrue
		System.out.println("p3***********id="+id);
		return "savePageid="+id;
	}

	@RequestMapping(value="/p4")
	public String p4(@RequestParam(name="id",defaultValue="77")Integer id ) {//�����ش�@RequestParam��requiredĬ��Ϊtrue
		System.out.println("p4***********id="+id);
		return "savePageid="+id;
	}
	@RequestMapping(value="/p6")
	public String p6(@RequestParam(name="id",defaultValue="100")Integer id  ) {//�����ɲ���������ʱĬ����100����ʱ��ȡ�����ֵ
		System.out.println("p4***********id="+id);
		return "savePageid="+id;
	}
	@RequestMapping(value="/p5")
	public String p5(@RequestParam(name="id",required=false)Integer id  ) {//���ò����ɲ���
		System.out.println("p4***********id="+id);
		return "savePageid="+id;
	}
}
