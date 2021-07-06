package com.nt.provider;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/emp")
public class EmployeeProvider {

	@GET
	@Path("/{empId}")
	public String show(@PathParam("empId") Integer id) {

		return "Hello#0" + " " + id;
	}

	@GET
	@Path("/{empId}/{empName}")
	public String show1(@PathParam("empId") Integer id, @PathParam("empName") String name) {

		return "Hello#1" + " " + id + " " + name;
	}

	@GET
	@Path("/{empId}/{empName}/{salary}")
	public String show2(@PathParam("empId") Integer id, @PathParam("empName") String name,
			@PathParam("salary") Double sal) {

		return "Hello#2" + " " + id + " " + name + " " + sal;
	}

}
