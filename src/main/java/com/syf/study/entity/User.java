package com.syf.study.entity;

import java.util.Date;

import lombok.Data;
@Data
public class User {

	private static final long serialVersionUID=1L;
	private Integer id;
	private String account;
	private String password;
	private String username;
	private String headerPic;
	private Integer age;
	private Date createTime;
	private Date updateTime;
	
}
