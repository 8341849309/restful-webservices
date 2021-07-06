package com.nt.entity;

import javax.ws.rs.QueryParam;

import lombok.Data;

@Data
public class Employee {
	private @QueryParam("empId") Integer eid;
	private @QueryParam("empName") String eName;
	private @QueryParam("esal") Double salary;
	
}
