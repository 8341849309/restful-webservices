package com.nt.provider;

import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;

@Path("/provider")
public class MessageProvider {

	@GET
	@Path("/msg")
	public String showMessage(@HeaderParam("username") String user, @HeaderParam("password") String pwd,
			@HeaderParam("otp") Integer otp) {

		return user + pwd + otp;
	}

}
