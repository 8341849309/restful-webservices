package com.nt.test;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.representation.Form;

public class FormParamTest {

	public static void main(String[] args) {

		String url = "http://localhost:8006/Rest05-Provider-FormParam/rs/provider/msg";

		System.out.println("-------Started----------");

		Client client = Client.create();

		WebResource wr = client.resource(url);

		// Create Form obj
		Form f = new Form();
		f.add("eid", "846736");
		f.add("ename", "Venkateswarlu");
		f.add("salary", 30670D);

		ClientResponse res = wr.post(ClientResponse.class, f);

		String str = res.getEntity(String.class);

		System.out.println(str);

	}

}
