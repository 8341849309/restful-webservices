package com.nt.provider;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import com.sun.jersey.api.client.ClientResponse.Status;
import com.sun.jersey.core.spi.factory.ResponseBuilderImpl;

@Path("/emp")
public class EmpProvider {

	@GET
	public Response show() {
		
		ResponseBuilder rb=new ResponseBuilderImpl();
		rb.entity("Hello Data!!!");
		rb.status(Status.OK);
		
		Response res=rb.build();
		
		return res;
	}
	
}
