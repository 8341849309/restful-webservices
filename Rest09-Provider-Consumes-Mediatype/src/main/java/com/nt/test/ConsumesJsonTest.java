package com.nt.test;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class ConsumesJsonTest {

	public static void main(String[] args) {

		String url = "http://localhost:8006/Rest09-Provider-Consumes-Mediatype/rs/emp/json";

		String json = "{\"empId\":846736,\"ename\":\"Venkateswarlu\",\"salary\":30600}";

		Client client = Client.create();

		WebResource wr = client.resource(url);

		ClientResponse res = wr.header("Content-Type", "application/json").post(ClientResponse.class, json);

		String str = res.getEntity(String.class);

		System.out.println(str);
		System.out.println(res.getStatus());
		System.out.println(res.getStatusInfo());
		System.out.println(res.getType());

	}

}
