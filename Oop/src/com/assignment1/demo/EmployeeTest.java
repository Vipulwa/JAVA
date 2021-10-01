package com.assignment1.demo;

class Employee{
	protected int id;
	protected String employeeName;
	public Employee(int id, String employeeName) {
		super();
		this.id = id;
		this.employeeName = employeeName;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", employeeName=" + employeeName + "]";
	}
	public void calculateSalary() {}
	
}
class Maneger extends Employee{
	
	private double allowance;
	private double salary;
	public Maneger(int id, String employeeName,double salary,double allowance ) {
		super(id, employeeName);
		this.salary=salary;
		this.allowance=allowance;
		
	}
	@Override
	public void calculateSalary() {
		System.out.println("Salary of "+employeeName+" is:"+(this.salary+(this.salary* this.allowance)/100));
	}
	
	
}


class SalesManeger extends Employee{
	
	private double commision;
	private double salary;
	public SalesManeger(int id, String employeeName,double salary,double commision ) {
		super(id, employeeName);
		this.salary=salary;
		this.commision=commision;
		
	}
	@Override
	public void calculateSalary() {
		System.out.println("Salary of "+employeeName+" is:"+(this.salary+(this.salary* this.commision)/100));
	}
	
	
}


public class EmployeeTest {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee1=new Maneger(1, "Soham", 50000, 20);
		System.out.println(employee1);
		employee1.calculateSalary();
		Employee employee2=new SalesManeger(2, "Shubham", 25000, 10);
		System.out.println(employee2);
		employee2.calculateSalary();

	}

}
