package com.nt.provider;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.nt.entity.Employee;

@Path("/emp")
public class EmployeeResource {

	@GET
	@Path("/show")
	@Produces("application/json")
	public Employee getEmployee() {

		Employee emp = new Employee();
		emp.setEmpId(846736);
		emp.setEname("Venkateswarlu");
		emp.setSalary(30600.0);

		return emp;
	}

}
