package com.nt.provider;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/provider")
public class MessageProvider {

	@POST
	@Path("/msg")
	public String showMessage(@FormParam("eid") int eid, @FormParam("ename") String ename,
			@FormParam("salary") double esal) {

		return "Hello: " + eid + "," + ename + "," + esal;
	}

}
