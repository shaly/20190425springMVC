package com.syf.study.entity;

import java.util.List;

import lombok.Data;

@Data
public class Order {

	private List<String > objName;
	
	private List<Car> cars;
	
}
