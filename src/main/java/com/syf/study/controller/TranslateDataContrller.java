package com.syf.study.controller;

import java.util.Date;
import java.text.SimpleDateFormat;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.syf.study.entity.User;

/**
 * 基础数据类型转换
 * @author Administrator
 *
 */
@RestController
public class TranslateDataContrller {
	
	//http://localhost:8080/springMVC/tDate?createTime=1990-01-01  //请求时页面会报错
	@RequestMapping("/tDate")
	public User tDate(User d) {
		System.out.println(d);
		return d;
	}
//	
//	@InitBinder
//	public void initBinder(WebDataBinder bind) {
//		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
//		bind.registerCustomEditor(Date.class, new CustomDateEditor(sdf, true));
//	}

}
