package com.nt.test;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nt.entity.Address;
import com.nt.entity.Person;

public class Test {

	public static void main(String[] args) {
		
		Address adrs=new Address();
		adrs.setState("AndhraPradesh");
		adrs.setDistrict("Chittor");
		adrs.setVillage("Madanapalle");
		adrs.setPincode(517325L);
		
		Person per=new Person();
		per.setId(846736);
		per.setName("Venkateswarlu");
		per.setIncome(30670);
		per.setAddress(adrs);
		
		
		try {
			ObjectMapper om=new ObjectMapper();
			
			String json=om.writeValueAsString(per);

			System.out.println(json);
			
			System.out.println("====================");
			
			json=om.writerWithDefaultPrettyPrinter().writeValueAsString(per);
			
			System.out.println(json);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
