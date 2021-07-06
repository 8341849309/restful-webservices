package com.nt.provider;

import java.util.StringTokenizer;

import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import org.apache.commons.codec.binary.Base64;

import com.sun.jersey.api.client.ClientResponse.Status;
import com.sun.jersey.core.spi.factory.ResponseBuilderImpl;

@Path("/validate")
public class ProviderAuthentication {

	@POST
	public Response processRequest(@HeaderParam("Authorization") String auth) {

		ResponseBuilder rb = new ResponseBuilderImpl();

		if (auth == null || auth.trim().equals("")) {
			rb.entity("Invalid Inputs Provided");
			rb.status(Status.BAD_REQUEST);
		}
		else {
			//1. Remove basic <space>
			auth=auth.replace("Basic ", "");
			
			//2. Decode
			byte[] enArr=auth.getBytes();
			byte[] decArr=Base64.decodeBase64(enArr);
			auth=new String(decArr);
			
			//3. Read username and password
			StringTokenizer str=new StringTokenizer(auth, ":");
			String username=str.nextToken();
			String password=str.nextToken();
			
			//4. Compare with DB
			if("admin".equals(username) && "manager".equals(password)) {
				rb.entity("Success!!!");
				rb.status(Status.OK);
			}else {
				rb.entity("Invalid Username/Password");
				rb.status(Status.UNAUTHORIZED);
			}
			
		}
		
		Response res=rb.build();
		
		return res;
	}

}
