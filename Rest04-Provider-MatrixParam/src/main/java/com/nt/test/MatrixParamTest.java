package com.nt.test;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class MatrixParamTest {

	public static void main(String[] args) {
		
		String url="http://localhost:8006/Rest04-Provider-MatrixParam/rs/provider/msg;eid=846736;ename=Venkateswarlu;salary=30600";
		
		Client client=Client.create();
		
		WebResource wr=client.resource(url);
		
		ClientResponse res=wr.get(ClientResponse.class);

		String str=res.getEntity(String.class);
		
		System.out.println(str);
		
	}

}
