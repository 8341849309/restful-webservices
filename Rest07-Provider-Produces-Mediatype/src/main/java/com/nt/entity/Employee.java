package com.nt.entity;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement
public class Employee {
	private Integer empId;
	private String ename;
	private Double salary;

}
