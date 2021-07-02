package com.nt.test;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class HeaderParamTest {

	public static void main(String[] args) {

		String url = "http://localhost:8006/Rest06-Provider-HeaderParam/rs/provider/msg";

		Client client = Client.create();

		WebResource wr = client.resource(url);

		ClientResponse res = wr.header("username", "846736")
				.header("password", "Verkst@123")
				.header("otp", "123456")
				.get(ClientResponse.class);

		String str = res.getEntity(String.class);

		System.out.println(str);

	}

}
