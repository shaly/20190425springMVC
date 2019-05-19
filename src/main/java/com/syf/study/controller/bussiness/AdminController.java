package com.syf.study.controller.bussiness;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {
	@GetMapping("/index")
	public String index() {
		System.out.println("index**********");
		return "admin/index";
	}
	@GetMapping("/add")
	public String add() {
		System.out.println("add**********");
		return "admin/add";
	}

	@GetMapping("/delete")
	public String test2() {
		System.out.println("delete**********");
		return "admin/delete";
	}
	@GetMapping("/update")
	public String update() {
		System.out.println("update**********");
		return "admin/update";
	}
	@GetMapping("/query")
	public String test4() {
		System.out.println("query**********");
		return "admin/query";
	}
}
