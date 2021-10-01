package com.assignment4.demo;

import java.util.HashMap;
import java.util.Map;

public class CloningTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		Employee employee = new Employee();
		employee.setId(1);
		employee.setName("Anupam");
		Map<String, String> props = new HashMap<>();
		props.put("salary", "10000");
		props.put("city", "Pune");
		Employee clonedEmp = (Employee) employee.clone();
		System.out.println("employee and clonedEmp == test: " + (employee == clonedEmp));
		employee.setName("new");
		System.out.println("clonedEmp ID: "+clonedEmp.getId()+",  clonedEmp Name:" + clonedEmp.getName());
	}

}
