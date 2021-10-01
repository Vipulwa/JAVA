package com.assignment1.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SortedSetEmployee {

	public void searchEmployee(List<Employee> employee) throws EmployeeNotFoundException{
		if(employee.containsAll(employee)) {
			System.out.println("Employee Found");
		}
		else {
			throw new EmployeeNotFoundException("Employee with this name not found");
		}
	}
	
	public static void main(String[] args) {
		Set<Employee> employeeSet = new HashSet<>();
		employeeSet.add(new Employee(4, "Anupam", 20000));
		employeeSet.add(new Employee(3, "Ritesh", 15000));
		employeeSet.add(new Employee(2, "Apurv", 23000));
		employeeSet.add(new Employee(5, "Kajol", 21000));
		employeeSet.add(new Employee(1, "Reema", 30000));
		employeeSet.forEach(p -> System.out.println(p));
		List<Employee> employee=new ArrayList<Employee>(employeeSet);
		Collections.sort(employee,(e1,e2)->e1.getId().compareTo(e2.getId()));
		System.out.println("\nSorted set of employees by ID");
		employee.forEach(p -> System.out.println(p));
		Collections.sort(employee,(e1,e2)->(int)e1.getSalary()-(int)e2.getSalary());
		System.out.println("\nSorted set of employees by Salary");
		employee.forEach(p -> System.out.println(p));
		Collections.sort(employee,(e1,e2)->e1.getName().compareTo(e2.getName()));
		System.out.println("\nSorted set of employees by Name");
		employee.forEach(p -> System.out.println(p));
		try {
			SortedSetEmployee setEmployee=new SortedSetEmployee();
			setEmployee.searchEmployee(employee);
		} catch (EmployeeNotFoundException e) {
			e.printStackTrace();
		}
	}
}
