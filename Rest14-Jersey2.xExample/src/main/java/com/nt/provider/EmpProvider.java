package com.nt.provider;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/emp")
public class EmpProvider {

	@GET
	public String show() {
		
		return "Hello";
	}
	
}
