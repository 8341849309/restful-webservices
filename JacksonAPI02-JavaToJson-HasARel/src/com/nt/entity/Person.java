package com.nt.entity;

import lombok.Data;

@Data
public class Person {
	private Integer id;
	private String name;
	private double income;
	private Address address;
	
}
