package com.syf.study.controller;

import java.util.Map;
 
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam; 
import org.springframework.web.bind.annotation.RestController;

import com.syf.study.entity.Car;
import com.syf.study.entity.Order;
import com.syf.study.entity.User;

@RestController//@RestController里面所有的方法都是异步方法，都会自动加上@ResponseBody
public class ParamterController {

	
	@RequestMapping(value="/p1",params="id")
	public String p1(@RequestParam("id")Integer id ) {//参数必传@RequestParam的required默认为true
		System.out.println("p1***********id="+id);
		return "savePageid="+id;
	}

	@RequestMapping(value="/p2",params= {"id","name"})
	public String p2(@RequestParam("id")Integer id
			,@RequestParam("name")String name) {//参数必传@RequestParam的required默认为true
		System.out.println("p2***********id="+id);
		System.out.println("p2***********name="+name);
		return "savePageid="+id+"name="+name;
	}

	@RequestMapping(value="/p3")
	public String p3(@RequestParam(value="id")Integer id ) {//参数必传@RequestParam的required默认为true
		System.out.println("p3***********id="+id);
		return "savePageid="+id;
	}

	@RequestMapping(value="/p4")
	public String p4(@RequestParam(name="id")Integer id ) {//参数必传@RequestParam的required默认为true
		System.out.println("p4***********id="+id);
		return "savePageid="+id;
	}
	@RequestMapping(value="/p6")
	public String p6(@RequestParam(name="id",defaultValue="100")Integer id  ) {//参数可不传，不传时默认是100，传时则取传输的值
		System.out.println("p4***********id="+id);
		return "savePageid="+id;
	}
	@RequestMapping(value="/p5")
	public String p5(@RequestParam(name="id",required=false)Integer id  ) {//设置参数可不传
		System.out.println("p4***********id="+id);
		return "savePageid="+id;
	}
	
	
	
	//================对象赋值===============
	//http://localhost:8080/springMVC/o1?id=1&account=001&password=990&pp=0
	//对应的值会加载到对象中，多余的值不影响访问【日期格式有问题，以后有时间再深究】
	@RequestMapping(value="/o1")
	public User o1(User u) {
		System.out.println("o1***********u="+u.toString());
		return u;
	}

	//http://localhost:8080/springMVC/o2?id=1&account=001&password=990&pp=0&name=车车
	//对应的值会加载到对象中，相同字段名不影响取值，相同字段名的值相同。多余的值不影响访问【日期格式有问题，以后有时间再深究】
	@RequestMapping(value="/o2")
	public String o2(User u,Car c) {
		System.out.println("o2***********u="+u.toString());
		System.out.println("o2***********c="+c.toString());
		return u.toString()+c.toString();
	}
	
//	@InitBinder("user")
//	public void initUser(WebDataBinder binder) {
//		binder.setFieldDefaultPrefix("user.");
//	}
//	@InitBinder("car")
//	public void initCar(WebDataBinder binder) {
//		binder.setFieldDefaultPrefix("car.");
//	}
	
	//http://localhost:8080/springMVC/o3?objName[0]=0&objName[1]=阿斯蒂芬&objName[5]=安安&account=001&password=990&cars[0].name=第一辆车&cars[0].id=0&cars[1].name=第二辆车&cars[4].id=0
	//对应的值会加载到对象中，多余的值不影响访问,List和数组都可以用下标来指定，没有值的下标数据为空比如0和5设置了值，1到4没设置值，那么1到4的值都为空
	@RequestMapping(value="/o3")
	public String o3(Order o) {
		System.out.println("o3***********c="+o.toString());
		return o.toString();
	}

	//http://localhost:8080/springMVC/o4?account=001&password=990
	//对应的值会加载到对象中，多余的值不影响访问，传啥有啥
	@RequestMapping(value="/o4")
	public Map<String ,String> o4(@RequestParam Map<String ,String> map) {
		System.out.println("o4***********c="+map.toString());
		return map;
	}
	
	
	
	
	
}
