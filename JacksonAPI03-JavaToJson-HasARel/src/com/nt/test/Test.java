package com.nt.test;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nt.entity.Margin;
import com.nt.entity.Model;
import com.nt.entity.Product;


public class Test {

	public static void main(String[] args) {
		
		Margin margin=new Margin(1234, "MGR1234");
		Model model=new Model(1234, "MODELA", 2000, margin);
		Product prod=new Product(1234, "ABCDE", model);
		
		
		try {
			ObjectMapper om=new ObjectMapper();
			
			String json=om.writeValueAsString(prod);

			System.out.println(json);
			
			System.out.println("====================");
			
			json=om.writerWithDefaultPrettyPrinter().writeValueAsString(prod);
			
			System.out.println(json);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
