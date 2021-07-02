package com.nt.test;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nt.entity.Employee;

public class Test {

	public static void main(String[] args) {
		
		//String json= "{\"id\":846736,\"name\":\"Venkat\",\"sal\":30670}";
		
		String json="{ }";
		
		try {
			ObjectMapper om=new ObjectMapper();
			
			Employee emp=om.readValue(json, Employee.class);
			System.out.println(emp);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
