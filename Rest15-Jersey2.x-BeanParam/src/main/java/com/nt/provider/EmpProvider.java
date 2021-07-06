package com.nt.provider;

import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.nt.entity.Employee;

@Path("/emp")
public class EmpProvider {

	@GET
	public String show(@BeanParam Employee e) {
		
		return "Hello "+e;
	}
	
}
