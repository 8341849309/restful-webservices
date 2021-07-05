package com.nt.entity;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@XmlRootElement
@AllArgsConstructor
@NoArgsConstructor
public class Person {
	private Integer pid;
	private String name;
	private Double salary;
}
