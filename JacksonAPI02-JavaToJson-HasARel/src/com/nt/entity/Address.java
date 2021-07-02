package com.nt.entity;

import lombok.Data;

@Data
public class Address {
	private String state;
	private String district;
	private String village;
	private Long pincode;
}
