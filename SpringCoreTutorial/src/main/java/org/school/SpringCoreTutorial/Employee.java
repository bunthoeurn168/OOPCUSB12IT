package org.school.SpringCoreTutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// POJO Class
@Component
public class Employee {
	private int id;
	private String name;
	
	@Autowired
	private Address address;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


	public Employee(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", " + address.toString() + "]";
	}
	
	
}
