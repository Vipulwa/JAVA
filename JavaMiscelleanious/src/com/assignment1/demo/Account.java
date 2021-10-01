package com.assignment1.demo;

public class Account {
	private int accountNumber;
	

	public Account(int accountNumber) {
		super();
		this.accountNumber = accountNumber;
	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + "]";
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	
}
