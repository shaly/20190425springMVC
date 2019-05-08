package com.syf.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import com.syf.study.entity.Car;
import com.syf.study.entity.User;

@Controller
public class ModelController {

	
	/**
	 * request���ü���ķ�ʽ
	 * ModelAndView
	 * ModelMap
	 * Model
	 * 
	 * session����
	 * @SessionAttributes();
	 * 
	 * Cookie����
	 * @CookieAttribute
	 */
	
	//ModelAndView�ײ�Ҳ��ʹ��ModelMap���д�ֵ��ֻ����ǰ�߶�һ����ͼ����
	//Ĭ�Ϸ��ص�ҳ��Ϊ�����ַ/handlerָ��/springMVC/WEB-INF/pages/handler.jsp,
	//��������ַΪ/a/handler���򷵻�ָ��/springMVC/WEB-INF/pages/a/handler.jsp,����ͨ��m.setViewName("handler");�޸ķ��ص�ַ
	@GetMapping("/a/handler")
	public ModelAndView handler() {
		ModelAndView m=new ModelAndView();
		User u=new User();
		u.setAccount("123");
		u.setId(99);
		m.addObject(u);//�ȼ���m.addObject("user",u);
		User u1=new User();
		u1.setAccount("111");
		u1.setId(111);
		m.addObject(u1);//�ȼ���m.addObject("user",u);�˴��Ὣ�Ϸ�����
		Car c=new Car();
		c.setName("car name");
		m.addObject(c);//�ȼ���m.addObject("car",u);
		User u2=new User();
		u2.setAccount("222");
		u2.setId(222);
		m.addObject("user2",u2);//ָ������ֵ����,���Ḳ��
		m.setViewName("handler");
		return m;
	}

	@GetMapping("/handler2")
	public String handler2(ModelMap m) {
		User u=new User();
		u.setAccount("123");
		u.setId(99);
		m.addAttribute(u);//�ȼ���m.addAttribute("user",u);
		return "handler";
	}

	@GetMapping("/handler3")
	public String handler3(Model m) {
		User u=new User();
		u.setAccount("123");
		u.setId(99);
		m.addAttribute(u);//�ȼ���m.addAttribute("user",u);
		return "handler";
	}

	
	@GetMapping("/handler4")
	public String handler4(@ModelAttribute("user")User u) {//ֻҪ����������@ModelAttribute�����Զ��Ѷ�Ӧ���ݷ��뵽ModelMap��
		u.setAccount("123");
		u.setId(99);
		return "handler";
	}
}
