package com.syf.study.entity;

import java.util.Date;

import lombok.Data;
@Data
public class Car {

	private static final long serialVersionUID=1L;
	private Integer id;
	private String name;
	private Date createTime;
	private Date updateTime;
	
}
