package com.nt.provider;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Path("/provider")
public class MessageProvider {

	/*
	 * Enter URL(http://localhost:8006/Rest03-Provider-QueryParam/rs/provider/
	 * msg?eid=846736&ename=Venkateswarlu&salary=30600) in browser
	 */
	
	@GET
	@Path("/msg")
	public String showMessage(
			@QueryParam("eid") int eid,
			@QueryParam("ename") String ename,
			@QueryParam("salary") double esal ) {
		
		return "Hello: "+eid+","+ename+","+esal;
	}
	
}
