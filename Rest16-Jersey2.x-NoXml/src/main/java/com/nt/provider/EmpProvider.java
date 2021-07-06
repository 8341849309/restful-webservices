package com.nt.provider;

import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.nt.entity.Employee;

@Path("/emp")
public class EmpProvider {

	@GET
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Employee show(@BeanParam Employee e) {
		
		return e;
	}
	
}
