package com.nt.test;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.nt.entity.Person;


public class Test {

	public static void main(String[] args) {
		
		List<String> names=List.of("Venkateswarlu","Yudhistir","Rama","Krishna");
		Set<Long> phones=Set.of(8341849309L,9618265905L);
		Map<String, LocalDate> dates=Map.of("DOB", LocalDate.of(1998, 06, 16), 
				                            "DOJ", LocalDate.of(2020, 01, 04));
		
		Person per=new Person();
		per.setPid(1234);
		per.setNickNames(names);
		per.setPhones(phones);
		per.setImpDates(dates);
		
		try {
			//enable java8 date/time type
			/*
			 * ObjectMapper om=new ObjectMapper(); om.findAndRegisterModules();
			 */
			
			ObjectMapper om=new ObjectMapper();
			om.registerModule(new JavaTimeModule());
			
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
