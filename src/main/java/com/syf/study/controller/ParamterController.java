package com.syf.study.controller;

import java.util.Map;

import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam; 
import org.springframework.web.bind.annotation.RestController;

import com.syf.study.entity.Car;
import com.syf.study.entity.Order;
import com.syf.study.entity.User;

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
	public String p4(@RequestParam(name="id")Integer id ) {//�����ش�@RequestParam��requiredĬ��Ϊtrue
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
	
	
	
	//================����ֵ===============
	//http://localhost:8080/springMVC/o1?id=1&account=001&password=990&pp=0
	//��Ӧ��ֵ����ص������У������ֵ��Ӱ����ʡ����ڸ�ʽ�����⣬�Ժ���ʱ�������
	@RequestMapping(value="/o1")
	public User o1(User u) {
		System.out.println("o1***********u="+u.toString());
		return u;
	}

	//http://localhost:8080/springMVC/o2?id=1&account=001&password=990&pp=0&name=����
	//��Ӧ��ֵ����ص������У���ͬ�ֶ�����Ӱ��ȡֵ����ͬ�ֶ�����ֵ��ͬ�������ֵ��Ӱ����ʡ����ڸ�ʽ�����⣬�Ժ���ʱ�������
	@RequestMapping(value="/o2")
	public String o2(User u,Car c) {
		System.out.println("o2***********u="+u.toString());
		System.out.println("o2***********c="+c.toString());
		return u.toString()+c.toString();
	}
	
	//������ͬ����������
	//��ʱ��ͬ����id��ֻ��user��id������ֵΪ1=��http://localhost:8080/springMVC/o2?user.id=1&account=001&password=990&pp=0&name=����
	//��ʱ��ͬ����id��ֻ��car��id������ֵΪ1=��http://localhost:8080/springMVC/o2?car.id=1&account=001&password=990&pp=0&name=����
	@InitBinder("user")
	public void initUser(WebDataBinder binder) {
		binder.setFieldDefaultPrefix("user.");
	}
	@InitBinder("car")
	public void initCar(WebDataBinder binder) {
		binder.setFieldDefaultPrefix("car.");
	}
	
	//http://localhost:8080/springMVC/o3?objName[0]=0&objName[1]=��˹�ٷ�&objName[5]=����&account=001&password=990&cars[0].name=��һ����&cars[0].id=0&cars[1].name=�ڶ�����&cars[4].id=0
	//��Ӧ��ֵ����ص������У������ֵ��Ӱ�����,List�����鶼�������±���ָ����û��ֵ���±�����Ϊ�ձ���0��5������ֵ��1��4û����ֵ����ô1��4��ֵ��Ϊ��
	@RequestMapping(value="/o3")
	public String o3(Order o) {
		System.out.println("o3***********c="+o.toString());
		return o.toString();
	}

	//http://localhost:8080/springMVC/o4?account=001&password=990
	//��Ӧ��ֵ����ص������У������ֵ��Ӱ����ʣ���ɶ��ɶ
	@RequestMapping(value="/o4")
	public Map<String ,String> o4(@RequestParam Map<String ,String> map) {
		System.out.println("o4***********c="+map.toString());
		return map;
	}
	

	//================restful�����Ļ�ȡ===============
	//�˲����޷�ͨ��request.getParmater��ȡ
	//http://localhost:8080/springMVC/restful1/1/Jane
	@RequestMapping("/restful1/{id}/{name}")
	public String restful1(@PathVariable("id")Integer uid,@PathVariable("name")String name) {

		System.out.println("restful1***********uid="+uid+"name="+name);
		return "id="+uid+";name="+name;
	}
	
	
	/**
	 * 1.������������ע��
	 * 2.��װ�������͵�ע��
	 * 3.����
	 * 4.map
	 * 5.list
	 * 6.set
	 * �����ע��
	 */
	//======================= ��1�� ========================
	//http://localhost:8080/springMVC/pBase?age=1
	//age�����ᱨ��
	@RequestMapping("/pBase")
	public String pBase(int age) {//������ָ�������
		System.out.println("age���䣺"+age);
		return age+"";
	}

	//http://localhost:8080/springMVC/pUnBase?age=1
	//age��������null
	@RequestMapping("/pUnBase")
	public String pUnBase(Integer age) {//������ָ�������
		System.out.println("pUnBase���䣺"+age);
		return age+"";
	}
	//======================= ��2�� ========================
	//======================= ��3�� ========================
	//======================= ��4�� ========================
	//======================= ��5�� ========================
	
}
