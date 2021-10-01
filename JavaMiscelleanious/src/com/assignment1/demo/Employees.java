package com.assignment1.demo;

public class Employees {
	private String employeeName;

	
	
	public Employees(String employeeName) {
		super();
		this.employeeName = employeeName;
	}

	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + "]";
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
	
	
}
