package com.nt.cfgs;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

import com.nt.filter.RestSecurityFilter;

@ApplicationPath("/rest")
public class AppConfig extends ResourceConfig {

	public AppConfig() {
		packages("com.nt.provider");
		register(RestSecurityFilter.class);
	}
	
}
