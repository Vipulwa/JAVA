package com.assignment1.demo;

class Employee{
	
	private int id;
	private String firstName;
	private String lastName;
	public Employee(int id, String firstName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
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
	
	
}

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee1= new Employee();
		employee1.setId(1);
		employee1.setFirstName("Soham");
		employee1.setLastName("Parik");
		System.out.println(employee1);
		
		Employee employee2= new Employee(2, "Nikhil", "Shinde");
		System.out.println(employee2);

	}

}
