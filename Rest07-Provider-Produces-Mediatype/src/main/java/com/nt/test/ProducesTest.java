package com.nt.test;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class ProducesTest {

	public static void main(String[] args) {

		String url = "http://localhost:8006/Rest07-Provider-Produces-Mediatype/rs/emp/show";

		Client client = Client.create();

		WebResource wr = client.resource(url);

		ClientResponse res = wr.get(ClientResponse.class);

		String str = res.getEntity(String.class);

		System.out.println(str);
		System.out.println(res.getStatus());
		System.out.println(res.getStatusInfo());
		System.out.println(res.getType());
		
	}

}
