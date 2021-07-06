package com.nt.provider;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import com.nt.entity.Employee;
import com.sun.jersey.core.spi.factory.ResponseBuilderImpl;

@Path("/emp")
public class EmployeeProvider {

	@GET
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Response getEmployee() {
		
		ResponseBuilder rb=new ResponseBuilderImpl();
		
		Employee emp=new Employee(846736, "Venkateswarlu", 30600.0);
		
		rb.entity(emp).status(200);
		
		return rb.build();
	}
	
}
