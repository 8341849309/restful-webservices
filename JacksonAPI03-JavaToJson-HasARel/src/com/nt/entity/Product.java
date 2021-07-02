package com.nt.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data 
@AllArgsConstructor
public class Product {
	private int pid;
	private String prodName;
	private Model model;
}
