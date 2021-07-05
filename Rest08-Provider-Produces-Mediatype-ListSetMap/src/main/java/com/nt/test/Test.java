package com.nt.test;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class Test {

	public static void main(String[] args) {
		
		String url="http://localhost:8006/Rest08-Provider-Produces-Mediatype-ListSetMap/rs/person";
		
		Client client=Client.create();
		
		WebResource wr=client.resource(url);
		
		ClientResponse cr=wr.get(ClientResponse.class);
		
		String str=cr.getEntity(String.class);
		
		System.out.println(str);
		
	}
	
}
