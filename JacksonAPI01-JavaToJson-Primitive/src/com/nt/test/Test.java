package com.nt.test;


import org.codehaus.jackson.map.ObjectMapper;

import com.nt.entity.Employee;

public class Test {

	public static void main(String[] args) {
		
		Employee emp=new Employee(846736, "Venkateswarlu", 30670.0f, "Verkst@123");
		
		try {
			ObjectMapper om=new ObjectMapper();
			
			String json=om.writeValueAsString(emp);
			System.out.println(json);
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
