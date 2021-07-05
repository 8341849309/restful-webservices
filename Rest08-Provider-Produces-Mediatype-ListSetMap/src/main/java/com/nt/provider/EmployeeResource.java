package com.nt.provider;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.nt.entity.Employee;

@Path("/emp")
public class EmployeeResource {

	@GET
	@Path("/json")
	@Produces(MediaType.APPLICATION_JSON)
	public Employee getEmployeeDetails() {

		List<String> names = new ArrayList<String>();
		names.add("Venkateswarlu");
		names.add("Rama");
		names.add("Krishna");

		Set<String> friends = new HashSet<>();
		friends.add("Manju");
		friends.add("Sunil");
		friends.add("Vishnu");

		Map<String, Long> phones=new HashMap<>();
		phones.put("Airtel", 8341849309L);
		phones.put("Vodafone", 9618265905L);
		
		Employee emp = new Employee(846736, names, friends, phones);

		return emp;
	}

	@GET
	@Path("/xml")
	@Produces(MediaType.APPLICATION_XML)
	public Employee getEmployeeXml() {

		List<String> names = new ArrayList<String>();
		names.add("Venkateswarlu");
		names.add("Rama");
		names.add("Krishna");

		Set<String> friends = new HashSet<>();
		friends.add("Manju");
		friends.add("Sunil");
		friends.add("Vishnu");

		Map<String, Long> phones=new HashMap<>();
		phones.put("Airtel", 8341849309L);
		phones.put("Vodafone", 9618265905L);
		
		Employee emp = new Employee(846736, names, friends, phones);

		return emp;
	}

}
