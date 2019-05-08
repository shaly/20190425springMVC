package com.syf.study.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.syf.study.entity.Car;
import com.syf.study.entity.User;

@Controller
@SessionAttributes({"user","car"})
public class ModelController {

	@ModelAttribute("user")//SessionAttributes中@ModelAttribute隐式调用,@SessionAttributes结合使用@ModelAttribute时必须加指定对象的隐式构造方法
	public User getUser() {
		return new User();
	}
	/**
	 * request作用级别的方式
	 * ModelAndView
	 * ModelMap
	 * Model
	 * 
	 * session级别
	 * @SessionAttributes();
	 * 
	 * Cookie级别
	 * @CookieAttribute
	 */
	
	//ModelAndView底层也是使用ModelMap进行存值，只不过前者多一个视图控制
	//默认返回的页面为请求地址/handler指向/springMVC/WEB-INF/pages/handler.jsp,
	//如果请求地址为/a/handler，则返回指向/springMVC/WEB-INF/pages/a/handler.jsp,可以通过m.setViewName("handler");修改返回地址
	@GetMapping("/a/handler")
	public ModelAndView handler() {
		ModelAndView m=new ModelAndView();
		User u=new User();
		u.setAccount("1");
		u.setId(1);
		m.addObject(u);//等价于m.addObject("user",u);
		User u1=new User();
		u1.setAccount("11");
		u1.setId(11);
		m.addObject(u1);//等价于m.addObject("user",u);此处会将上方覆盖
		Car c=new Car();
		c.setName("car name");
		m.addObject(c);//等价于m.addObject("car",u);
		User u2=new User();
		u2.setAccount("111");
		u2.setId(111);
		m.addObject("user2",u2);//指定返回值名称,不会覆盖
		m.setViewName("handler");
		return m;
	}

	@GetMapping("/handler2")
	public String handler2(ModelMap m) {
		User u=new User();
		u.setAccount("2");
		u.setId(22);
		m.addAttribute(u);//等价于m.addAttribute("user",u);
		return "handler";
	}

	@GetMapping("/handler3")
	public String handler3(Model m) {
		User u=new User();
		u.setAccount("3");
		u.setId(33);
		m.addAttribute(u);//等价于m.addAttribute("user",u);
		return "handler";
	}

	
	@GetMapping("/handler4")
	public String handler4(@ModelAttribute("user")User u) {//只要给参数加入@ModelAttribute，会自动把对应数据放入到ModelMap中
		
		return "handler";
	}
	
	
	@GetMapping("/handler5")
	public String handler5(HttpSession session) {//session作用域的最简便方式
		User u=new User();
		u.setAccount("5");
		u.setId(55);
		session.setAttribute("user", u);
		System.out.println(session.getAttribute("user"));
		return "handler";
	}


	@GetMapping("/handler6")
	public String handler6(@ModelAttribute("car")Car u) {//只要给参数加入@ModelAttribute，会自动把对应数据放入到ModelMap中
		
		return "handler";
	}
}
