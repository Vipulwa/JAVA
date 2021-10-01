package com.assignment2.demo;

public class Employee {
	
	private int id;
	private String firstName;
	private String lastName;

	public Employee(int id, String firstName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
		public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}

	public static void main(String[] args) {
		Employee employees[]=new Employee[10];
		int count=0;
		Employee employee1= new Employee(1, "Soham","Parik");
		employees[0]=employee1;
		count++;
		Employee employee2= new Employee(2, "Sanket","Parik");
		employees[1]=employee2;
		count++;
		System.out.println("Total element in Array is:"+count);
	}

}
