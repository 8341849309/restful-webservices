package com.nt.test;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class ClientTest {

	public static void main(String[] args) {

		//Create URL
		String url = "http://localhost:8006/Rest01-Provider-FirstApp/rs/provider/msg";

		//Create Client obj
		Client client = Client.create();

		//Create WebResource obj using Client obj
		WebResource wr = client.resource(url);

		//Create ClientResponse obj
		ClientResponse res = wr.get(ClientResponse.class);

		//Get Result
		String str = res.getEntity(String.class);

		// response deatils
		System.out.println(str);

		System.out.println("Status " + res.getStatus());
		System.out.println("Status Info " + res.getStatusInfo());

	}

}
