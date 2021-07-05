package com.nt.provider;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import com.nt.entity.Employee;

@Path("/emp")
public class EmployeeResource {

	@POST
	@Path("/json")
	@Consumes("application/json")
	public String showEmployeeJson(Employee emp) {

		System.out.println("Json...");
		
		return emp.getEmpId()+" "+emp.getEname();
	}
	
	@POST
	@Path("/xml")
	@Consumes("application/xml")
	public String showEmployeeXml(Employee emp) {

		System.out.println("Xml...");
		
		return emp.getEmpId()+" "+emp.getEname();
	}

}
