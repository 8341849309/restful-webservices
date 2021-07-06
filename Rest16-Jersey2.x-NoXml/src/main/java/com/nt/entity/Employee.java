package com.nt.entity;

import javax.json.bind.annotation.JsonbProperty;
import javax.json.bind.annotation.JsonbPropertyOrder;
import javax.json.bind.annotation.JsonbTransient;
import javax.ws.rs.QueryParam;
import javax.xml.bind.annotation.XmlRootElement;

@JsonbPropertyOrder({ "eid", "name", "sal" })
@XmlRootElement
public class Employee {
	@JsonbTransient
	private @QueryParam("eId") Integer eid;
	@JsonbProperty("emp-name")
	private @QueryParam("eName") String name;
	private @QueryParam("eSal") Double sal;

	public Integer getEid() {
		return eid;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSal() {
		return sal;
	}

	public void setSal(Double sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", sal=" + sal + "]";
	}

}
