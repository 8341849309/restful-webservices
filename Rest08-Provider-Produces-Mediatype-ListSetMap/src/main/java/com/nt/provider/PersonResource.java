package com.nt.provider;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.nt.entity.Person;

@Path("/person")
public class PersonResource {

	@GET
	@Path("/json")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Person> getPersonJson() {

		List<Person> list=new ArrayList<Person>();
		
		Person per = new Person();
		per.setPid(846736);
		per.setName("Venkateswarlu");
		per.setSalary(30600.0);

		Person per1=new Person(846737, "SivaReddy", 30600.0);
		Person per2=new Person(846732, "Rama", 999999.0);
		
		list.add(per);	list.add(per1);	list.add(per2);
		
		return list;
	}
	
	@GET
	@Path("/xml")
	@Produces(MediaType.APPLICATION_XML)
	public List<Person> getPersonXml() {

		List<Person> list=new ArrayList<Person>();
		
		Person per = new Person();
		per.setPid(846736);
		per.setName("Venkateswarlu");
		per.setSalary(30600.0);

		Person per1=new Person(846737, "SivaReddy", 30600.0);
		Person per2=new Person(846732, "Rama", 999999.0);
		
		list.add(per);	list.add(per1);	list.add(per2);
		
		return list;
	}
	
}
