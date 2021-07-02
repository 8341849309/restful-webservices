package com.nt.provider;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/provider")
public class MessageProvider {

	@GET
	@Path("/msg")
	public String showMessage() {
		
		return "Welcome to Restful Webservices!!!";
	}
	
}
