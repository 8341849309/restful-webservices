package com.nt.consumer;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

import com.nt.entity.Employee;

@Path("/emp")
public class EmployeeConsumer {

	@POST
	@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public String show(Employee e) {
		
		return e.getEmpId()+" "+e.getEmpName()+" "+e.getSalary();
	}
	
}
