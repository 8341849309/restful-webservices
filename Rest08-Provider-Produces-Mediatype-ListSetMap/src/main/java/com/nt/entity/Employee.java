package com.nt.entity;

import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@XmlRootElement
public class Employee {
	private Integer empId;
	private List<String> names;
	private Set<String> friends;
	private Map<String, Long> phones;
	
}
