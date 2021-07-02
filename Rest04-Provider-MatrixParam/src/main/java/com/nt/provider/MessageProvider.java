package com.nt.provider;

import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;

@Path("/provider")
public class MessageProvider {

	/*
	 * Enter URL(http://localhost:8006/Rest03-Provider-QueryParam/rs/provider/
	 * msg;eid=846736;ename=Venkateswarlu;salary=30600) in browser
	 */

	@GET
	@Path("/msg")
	public String showMessage(@MatrixParam("eid") int eid, @MatrixParam("ename") String ename,
			@MatrixParam("salary") double esal) {

		return "Hello: " + eid + "," + ename + "," + esal;
	}

}
