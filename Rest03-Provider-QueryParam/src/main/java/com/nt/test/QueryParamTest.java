package com.nt.test;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class QueryParamTest {

	public static void main(String[] args) {
		
		//String url="http://localhost:8006/Rest03-Provider-QueryParam/rs/provider/msg?eid=846736&ename=Venkateswarlu&salary=30600";
		String url="http://localhost:8006/Rest03-Provider-QueryParam/rs/provider/msg";
		
		Client client=Client.create();
		
		WebResource wr=client.resource(url);
		wr=wr.queryParam("eid", "846742");
		wr=wr.queryParam("ename", "Neeraja");
		wr=wr.queryParam("salary", "30600");
		
		ClientResponse res=wr.get(ClientResponse.class);

		String str=res.getEntity(String.class);
		
		System.out.println(str);
		
	}

}
