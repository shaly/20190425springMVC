package com.syf.study.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import lombok.Data;
@Data
public class User implements Serializable {

	private static final long serialVersionUID=1L;
	private Integer id;
	private String account;
	private String password;
	private String username;
	private String headerPic;
	private Integer age;
	private Date createTime;
	private Date updateTime;
	private List<Order> orders;
	
}
